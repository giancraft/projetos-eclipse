package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo implements Animal{
	private final ArrayList<Animal> animais = new ArrayList<>();
	
	public boolean removeAnimal(Animal animal) {
		if (!animais.contains(animal)) {
			return false;
		} else {
			animais.remove(animal);
			return true;
		}
	}
	
	public boolean addAnimal(Animal animal) {
		if (animais.contains(animal)) {
			return false;
		} else {
			animais.add(animal);
			return true;
		}
	}

	public void nome() {
		animais.forEach(Animal::nome);
	}
	
	public void descricao() {
		animais.forEach(Animal::descricao);
	}
	
	public void execucao() {
		nome();
		descricao();
	}
	public boolean contains(Animal animal) {
		return animais.contains(animal);
	}
	public boolean isEmpty() {
		return animais.isEmpty();
	}
	
	public Iterator<Animal> iterator() {
		return animais.iterator();
	}
}