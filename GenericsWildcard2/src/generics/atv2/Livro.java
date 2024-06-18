package generics.atv2;

import java.util.List;
import java.util.ArrayList;

public class Livro<T> {
	
	private List<Capitulo<T>> lista = new ArrayList<>();
	
	public boolean escrever(Capitulo<T> capitulo) {
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNumero() == capitulo.getNumero())
				return false;
		}
		lista.add(capitulo);
		return true;
	}
	
	public List<Capitulo<T>> mostrarLista(){
		return lista;
	}
	
	
}
