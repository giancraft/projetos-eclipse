package atv5;

import java.util.List;
import java.util.ArrayList;

public class ListaEncadeada {
private Nodo inicio;
	
	public ListaEncadeada() {
		inicio = null;
	}

	public Nodo getInicio() {
		return inicio;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void mostrarLista() {
		if(vazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		Nodo aux = inicio;
		while (aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProx();
		}
		System.out.println();
	}
	
	public void mostrarListaReversa() {
		if(vazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		Nodo aux = inicio;
		List<Integer> lista = new ArrayList<>();
		while (aux != null) {
			lista.add(aux.getDado());
			aux = aux.getProx();
		}
		
		for (int i = lista.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
	}
}
