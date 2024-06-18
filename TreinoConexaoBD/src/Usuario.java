
public class Usuario {
	
	private String nome;
	private String senha;
	private String host;
	private String porta;
	
	public Usuario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nome=");
		builder.append(nome);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", host=");
		builder.append(host);
		builder.append(", porta=");
		builder.append(porta);
		builder.append("]");
		return builder.toString();
	}
}
