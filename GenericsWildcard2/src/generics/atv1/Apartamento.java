package generics.atv1;

import java.util.List;
import java.util.ArrayList;

public class Apartamento<T extends Item> {
	
	private List<T> itens = new ArrayList<>();
	
	public void acomodar(T item) {
		itens.add(item);
	}
	
	public List<T> mostrarLista(){
		return itens;
	}
}
