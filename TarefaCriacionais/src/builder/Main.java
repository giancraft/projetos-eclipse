package builder;

public class Main {
	public static void main(String[] argos) {
		CamisetaDirector cd =
			new CamisetaDirector(new CamisetaAlgodao());
			cd.construirCamiseta("Adidas");
			Camiseta c1 = cd.getCamiseta();
			System.out.println(c1);
				
			cd = new CamisetaDirector(new CamisetaPoliester());
			cd.construirCamiseta("Nike");
			Camiseta c2 = cd.getCamiseta();
			System.out.println(c2);
				
			cd = new CamisetaDirector(new CamisetaMalhaFria());
			cd.construirCamiseta("Gucci");
			Camiseta c3 = cd.getCamiseta();
			System.out.println(c3);
	}
}
