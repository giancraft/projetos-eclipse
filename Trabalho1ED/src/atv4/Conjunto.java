package atv4;

import java.util.List;
import java.util.ArrayList;

public class Conjunto {
private Nodo inicio;
	
	public Conjunto() {
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
	
	public int contadorLista() {
		int count = 0;
		Nodo aux = inicio;
		while (aux != null) {
			count++;
			aux = aux.getProx();
		}
		return count;
	}
	
	public void uniao(Conjunto conj1, Conjunto conj2) {
		Conjunto maior;
		Conjunto diferente;
		List<Integer> uniao = new ArrayList<>();
		if (conj1.contadorLista() > conj2.contadorLista()) {
			maior = conj1;
			diferente = conj2;
		} else {
			maior = conj2;
			diferente = conj1;
		}
		Nodo aux = maior.getInicio();
		while (aux != null) {
			uniao.add(aux.getDado());
			aux = aux.getProx();
		}
		aux = diferente.getInicio();
		for (int i = 0; i < diferente.contadorLista(); i++) {
			if (uniao.get(i) != aux.getDado()) {
				uniao.add(aux.getDado());
			}
			aux = aux.getProx();
		}
		System.out.println("A uniao dos conjuntos é: " + uniao);
		}
	
	public void interseccao(Conjunto conj1, Conjunto conj2) {
		List<Integer> intersec = new ArrayList<>();
		Nodo aux = conj1.getInicio();
		Nodo aux2 = conj2.getInicio();
		while (aux != null) {
			while (aux2 != null) {
				if (aux2.getDado() == aux.getDado()) {
					intersec.add(aux.getDado());
				}
				aux2 = aux2.getProx();
			}
			aux = aux.getProx();
			aux2 = conj2.getInicio();
		}
		System.out.println("A interseccao dos conjuntos é: " + intersec);
	}
	
	public void diferenca(Conjunto conj1, Conjunto conj2) {
		List<Integer> diferenca = new ArrayList<>();
	    Nodo aux = conj1.getInicio();
	    while (aux != null) {
	        boolean encontrado = false;
	        Nodo aux2 = conj2.getInicio();
	        while (aux2 != null) {
	            if (aux2.getDado() == aux.getDado()) {
	                encontrado = true;
	                break;
	            }
	            aux2 = aux2.getProx();
	        }
	        if (!encontrado) {
	            diferenca.add(aux.getDado());
	        }
	        aux = aux.getProx();
	    }
	    aux = conj2.getInicio();
	    while (aux != null) {
	        boolean encontrado = false;
	        Nodo aux2 = conj1.getInicio();
	        while (aux2 != null) {
	            if (aux2.getDado() == aux.getDado()) {
	                encontrado = true;
	                break;
	            }
	            aux2 = aux2.getProx();
	        }
	        if (!encontrado) {
	            diferenca.add(aux.getDado());
	        }
	        aux = aux.getProx();
	    }
	    System.out.println("A diferença dos conjuntos é: " + diferenca);
	}	
}
