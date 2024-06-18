
public class Cachorro {
	
	private float peso;
	private String raca;
	private float tamanho;
	private String nome;
	
	public Cachorro(float tamanho, float peso) {
		setTamanho(tamanho);
		setPeso(peso);
	}
	
	public Cachorro() {
		
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		if (peso > 0)
			this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if (raca.length() > 0)
			this.raca = raca;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		if (tamanho > 0)
			this.tamanho = tamanho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [peso=");
		builder.append(peso);
		builder.append(", raca=");
		builder.append(raca);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
