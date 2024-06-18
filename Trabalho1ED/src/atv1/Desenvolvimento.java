package atv1;

import java.util.List;
import java.util.ArrayList;

public class Desenvolvimento {
private Nodo inicio;
	
	public Desenvolvimento() {
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
	
	public void funcao(Nodo inicio, int dado) {
		if (vazia()) {
			System.out.println("A lista está vazia");
			return;
		}
		Nodo aux = inicio;
		int count1 = 0; // contador do total de nodos
		int count2 = 0; // contador do número de nodos iguais ao valor passado como parâmetro
		int count3 = 0; // contador do número de nodos maiores que o valor passado como parâmetro
		int posicao = 0;
		List<Integer> iguais = new ArrayList<>();
		while (aux != null) {
			count1++;
			if (aux.getDado() == dado) {
				count2++;
				iguais.add(posicao);
			}
			if (aux.getDado() > dado) {
				count3++;
			}
			posicao++;
			aux = aux.getProx();
		}
		System.out.println("O total de nodos na lista é: " + count1);
		System.out.println("O número de nodos que possuem o mesmo valor parametrizado: " + count2);
		System.out.println("As posições dos nodo que possuem o mesmo valor parametrizado: " + iguais);
		System.out.println("O número de nodos que possuem um valor maior que o valor parametrizado: " + count3);
		
	}
}
