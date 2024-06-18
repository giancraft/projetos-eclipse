package listas_lineares;

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
	
	public void inserirFinal(int dado) {
		if (vazia()) {
			inserirInicio(dado);
			return;
		}
		Nodo novoNodo = new Nodo(dado);
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
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
	
	public void deleteComValor(int valor) {
		if (vazia()) 
			return;
		if (inicio.getDado() == valor) {
			inicio = inicio.getProx();
			return;
		}
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			if (aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	
	public int contadorNodos() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return 0;
		}
		Nodo aux = inicio;
		int count = 0;
		while (aux != null) {
			count++;
			aux = aux.getProx();
		}
		System.out.println("O número de Nodos é: " + count);
		return count;
	}
	
	public void deletarPrimeiro() {
		inicio = inicio.getProx();
		return;
	}
	
	public void deletarUltimo() {
		if (vazia()) {return;}
		
		if (inicio.getProx() == null) {
			inicio = null;
			return;
		}
		
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			aux = aux.getProx();
			if(aux.getProx().getProx() == null) {
				aux.setProx(aux.getProx().getProx());
			}
		}
	}
	
	public void procurarValor(int valor) {
		if(vazia()) {return;}
		
		int posicao = 0;
		if(inicio.getProx() == null) {
			System.out.println("A posição do valor é: " + posicao);
			return;
		}
		
		Nodo aux = inicio;
		boolean parada = true;
		while (aux.getProx() != null && parada) {
			if (aux.getDado() == valor) {
				parada = false;
			}else
				posicao++;
			aux = aux.getProx();
		}
		System.out.println("A posição do valor é: " + posicao);
	}		
	
	
}
