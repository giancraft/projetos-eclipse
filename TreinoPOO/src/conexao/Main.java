package conexao;

public class Main {

	public static void main(String[] args) {
		ConexaoBD conn = new ConexaoBD()
			.conectarEm("localhost")
			.naPorta(3306)
			.usandoUsuario("root")
			.comASenha("12345");
		
		System.out.println(conn);
	}

}
