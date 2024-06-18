package exemplosSingleton;

public class Main {
	public static void main(String[] args) {
	
		ConfigApp config1 = ConfigApp.getInstance();
		ConfigApp config2 = ConfigApp.getInstance();
		ConfigApp config3 = ConfigApp.getInstance();
		
		ControleImpressao con1 = ControleImpressao.getInstance();
		ControleImpressao con2 = ControleImpressao.getInstance();
		ControleImpressao con3 = ControleImpressao.getInstance();
		
		config1.setIdioma("Português Brasileiro");
		config2.setAutenticacao("Email");
		config3.setVisibilidadeAtividades(false);
		
		con1.setDocumento("Certidão de Nascimento");
		con2.setPaginas("Todas");
		con3.setImpressoes(5);
		
		System.out.println(config1);
		System.out.println(config2);
		System.out.println(config3);
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}
}
