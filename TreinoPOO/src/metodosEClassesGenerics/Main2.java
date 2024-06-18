package metodosEClassesGenerics;

public class Main2 {

	public static void main(String[] args) {
		Gato[] gatos = new Gato[2];
		Animal[] animais = gatos;
		animais[0] = new Cachorro();
	}
}
