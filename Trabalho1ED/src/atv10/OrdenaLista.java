package atv10;

import java.util.*;

public class OrdenaLista {
	private Nodo inicio;
	private Nodo fim;
	
	public OrdenaLista() {
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
	
	public void ordenarAleatorio() {
		for (int i = 0; i < 100; i++) {
			 Random random = new Random();
			 int numeroAleatorio = random.nextInt(100);
			 inserirInicio(numeroAleatorio);
		}
		List<Nodo> lista = new ArrayList<>();
		Nodo aux = inicio;
		do {
			lista.add(new Nodo(aux.getDado()));
			aux = aux.getProx();
		} while (aux != inicio);
		
		for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).getDado() < lista.get(j + 1).getDado()) {
                    Nodo temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
		
		OrdenaLista ol = new OrdenaLista();
		for (int i = 0; i < lista.size(); i++) {
			ol.inserirInicio(lista.get(i).getDado());
		}
		
		aux = ol.getInicio();
		do {
			System.out.println(aux.getDado());
			aux = aux.getProx();
		} while (aux != ol.getInicio());
	}
}
