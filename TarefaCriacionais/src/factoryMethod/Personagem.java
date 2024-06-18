package factoryMethod;

public class Personagem implements IPersonagem{
	private String nome;
	private String classe;
	
	public Personagem(String nome, String classe) {
		setNome(nome);
		setClasse(classe);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personagem [nome=");
		builder.append(nome);
		builder.append(", classe=");
		builder.append(classe);
		builder.append("]");
		return builder.toString();
	}	
}
