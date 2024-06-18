package generics.atv1;

public abstract class Item {
	private String nome;
	private String cor;
	
	public Item(String nome, String cor) {
		setNome(nome);
		setCor(cor);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [nome=");
		builder.append(nome);
		builder.append(", cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
}
