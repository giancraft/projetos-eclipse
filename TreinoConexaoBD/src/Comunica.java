import java.sql.Connection;
import java.sql.DriverManager;

public class Comunica {
	
	private static Comunica com;
	
	private String nome = "root";
	private String senha = "";
	private String host = "localhost";
	private String porta = "3306";
	
	private Comunica() {
		
	}
	
	public static Comunica getCom() {
		return com;
	}
	public static void setCom(Comunica com) {
		Comunica.com = com;
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

	public static Comunica getInstance() {
		if (com == null)
			com = new Comunica();
		return com;
	}
	
	final String NOME_DO_BANCO = "comunicacao";
    public Connection conectar() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+ getHost() +":"+ getPorta() + "/" + NOME_DO_BANCO;
            return DriverManager.getConnection(url,getNome(),getSenha());
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }
    }
}
