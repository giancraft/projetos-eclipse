package atv3;

import java.util.List;
import java.util.ArrayList;

public class Pedido<T extends ProdutoX> {
	private List<T> lista = new ArrayList<>();

	public void addLista(T produto) {
		if(lista.isEmpty())
			lista.add(produto);
		for(int i = 0; i < lista.size(); i++) {
			if (!lista.get(i).equals(produto))
				lista.add(produto);
		}
	}
	
	public List<T> mostrarLista(){
		return lista;
	}
}
