package atv3;

public class Filme extends ProdutoX{
	private int duracao; //em minutos
	
	public Filme(String nome, String genero, String diretor, String atorPrincipal, int duracao) {
		super(nome, genero, diretor, atorPrincipal);
		setDuracao(duracao);
	}

	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Filme [duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
