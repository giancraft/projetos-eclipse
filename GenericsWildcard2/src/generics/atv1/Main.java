package generics.atv1;

public class Main {

	public static void main(String[] args) {
		Apartamento<Item> ap = new Apartamento<>();
		// Ou Apartamento ap = new Apartamento();
		
		Movel sofa = new Movel("Sofá", "Marrom");
		Eletrodomestico geladeira = new Eletrodomestico("Geladeira", "Branca", 48.8);
		
		ap.acomodar(geladeira);
		ap.acomodar(sofa);
		
		System.out.println(ap.mostrarLista());
	}

}
