package atv3;

public abstract class ProdutoX {
	private String nome;
	private String genero;
	private String diretor;
	private String atorPrincipal;
	
	public ProdutoX(String nome, String genero, String diretor, String atorPrincipal) {
		setNome(nome);
		setGenero(genero);
		setDiretor(diretor);
		setAtorPrincipal(atorPrincipal);
	}
	
	public ProdutoX() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getAtorPrincipal() {
		return atorPrincipal;
	}
	public void setAtorPrincipal(String atorPrincipal) {
		this.atorPrincipal = atorPrincipal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [nome=");
		builder.append(nome);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", diretor=");
		builder.append(diretor);
		builder.append(", atorPrincipal=");
		builder.append(atorPrincipal);
		builder.append("]");
		return builder.toString();
	}
}
