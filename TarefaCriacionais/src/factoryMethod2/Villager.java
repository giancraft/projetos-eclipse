package factoryMethod2;

public class Villager implements IVillager{
	private String nome;
	private String profissao;
	
	public Villager(String nome, String profissao) {
		setNome(nome);
		setProfissao(profissao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Villager [nome=");
		builder.append(nome);
		builder.append(", profissao=");
		builder.append(profissao);
		builder.append("]");
		return builder.toString();
	}
}
