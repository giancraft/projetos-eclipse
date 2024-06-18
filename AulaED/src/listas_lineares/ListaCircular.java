package listas_lineares;

public class ListaCircular {
	private Nodo inicio;
	private Nodo fim;
	
	public ListaCircular() {
		inicio = null;
	}
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if (inicio == null) {// caso lista esteja vazia
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		}  else {// caso lista não esteja vazia
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	
	public void inserirFinal(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if (inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else {
			novoNodo.setProx(inicio);
			while (fim.getProx() != inicio) {
				fim = fim.getProx();
			}
			fim.setProx(novoNodo);
		}
	}
	
	public String mostrarLista() {
		String lista = "";
		if (inicio == null) return lista;
		Nodo aux = inicio;
		do {
			lista += aux.getDado() + "\n";
			aux = aux.getProx();
		} while(aux != inicio);
		return lista;
	}
	
	public void deleteComValor(int dado) {
		if (inicio == null) return;
		if (inicio.getDado() == dado) {
			if(inicio == fim) {// se a lista possuir apenas um elemento
				inicio = null;
				return;
			}
			// se o elemento for o primeiro da lista e ela possui outros
			inicio = inicio.getProx();
			fim.setProx(inicio);
			return;
		}
		Nodo aux = inicio;
		do {
			if (aux.getProx().getDado() == dado) {
				if (aux.getProx() == fim) 
					fim = aux;
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		} while (aux != inicio);
	}
	
	public void buscarPosicao(int valor) {
		if (inicio == null) return;
		
		int posicao = 0;
		if (inicio.getDado() == valor) {
			System.out.println("A posição do valor é: " + posicao);
			return;
		}
		Nodo aux = inicio;
		do {
			posicao++;
			if (aux.getProx().getDado() == valor) {
				System.out.println("A posição do valor é: " + posicao);
				return;
			}
			aux = aux.getProx();
		} while (aux != inicio);
	}
}
