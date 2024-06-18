package animal;

public class Animal {
	
	private String alimentaçao;
	private String habitat;
	private String tipoDeslocamento;
	private float peso;
	
	public String getAlimentaçao() {
		return alimentaçao;
	}
	public void setAlimentaçao(String alimentaçao) {
		this.alimentaçao = alimentaçao;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getTipoDeslocamento() {
		return tipoDeslocamento;
	}
	public void setTipoDeslocamento(String tipoDeslocamento) {
		this.tipoDeslocamento = tipoDeslocamento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public boolean deslocar() {
		return true;
	}
	public boolean comer(float quantidade) {
		peso += quantidade;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [alimentaçao=");
		builder.append(alimentaçao);
		builder.append(", habitat=");
		builder.append(habitat);
		builder.append(", tipoDeslocamento=");
		builder.append(tipoDeslocamento);
		builder.append(", peso=");
		builder.append(peso);
		builder.append("]");
		return builder.toString();
	}

}
