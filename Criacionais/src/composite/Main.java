package composite;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Zoo animais = new Zoo();
		animais.addAnimal(new Cachorro());
		animais.addAnimal(new Aguia());
		
		Zoo familias = new Zoo();
		familias.addAnimal(new AveDeRapina());
		
		Zoo ordem = new Zoo();
		ordem.addAnimal(new Mamifero());
		ordem.addAnimal(new Passaro());
		
		zoo.addAnimal(animais);
		zoo.addAnimal(familias);
		zoo.addAnimal(ordem);
		
		zoo.execucao();
	}

}
