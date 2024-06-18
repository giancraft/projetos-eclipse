package animal;

public class Mamifero extends Animal{
	
	private String ambiente; //Aquático ou Terrestre.
	private String pelagem;
	private int quantidadeMamas;
	private String especie;
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public int getQuantidadeMamas() {
		return quantidadeMamas;
	}
	public void setQuantidadeMamas(int quantidadeMamas) {
		this.quantidadeMamas = quantidadeMamas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [ambiente=");
		builder.append(ambiente);
		builder.append(", pelagem=");
		builder.append(pelagem);
		builder.append(", quantidadeMamas=");
		builder.append(quantidadeMamas);
		builder.append(", especie=");
		builder.append(especie);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
