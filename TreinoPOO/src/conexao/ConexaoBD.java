package conexao;

public class ConexaoBD {
	
	private String host;
	private int porta;
	private String user;
	private String pass;
	
	public ConexaoBD conectarEm(String host) {
		this.host = host;
		return this;
	}
	
	public ConexaoBD naPorta(int porta) {
		this.porta = porta;
		return this;
	}
	
	public ConexaoBD usandoUsuario(String user) {
		this.user = user;
		return this;
	}
	
	public ConexaoBD comASenha(String pass) {
		this.pass = pass;
		return this;
	}

	@Override
	public String toString() {
		return "ConexaoBD [host=" + host + ", porta=" + porta + ", user=" + user + ", pass=" + pass + "]";
	}

}
