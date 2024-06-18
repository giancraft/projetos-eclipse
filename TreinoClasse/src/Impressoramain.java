
public class Impressoramain {
	
	public static void main(String[] args) {
		
		Documento doc = new Documento("Gianluca");
		
		Impressora imp = new Impressora(doc);
		System.out.println(imp.imprimir());
		
	}

}
