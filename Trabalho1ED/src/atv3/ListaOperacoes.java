package atv3;

public class ListaOperacoes {
	private Nodo inicio;
	private Nodo fim;
	
	public ListaOperacoes() {
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
	
	public void calculos() {
		if (inicio == null) return;
		Nodo aux = inicio;
		int maior = 0;
		int menor = 0;
		int count = 0;
		int soma = 0;
		do {
			if (count == 0) {
				maior = aux.getDado();
				menor = aux.getDado();
			}
			if (aux.getDado() > maior)
				maior = aux.getDado();
			if (aux.getDado() < menor)
				menor = aux.getDado();
			soma += aux.getDado();
			aux = aux.getProx();
			count++;
		} while(aux != inicio);
		int media = soma / count;
		System.out.println("O maior elemento da lista é: " + maior);
		System.out.println("O menor elemento da lista é: " + menor);
		System.out.println("A média dos elementos da lista é: " + media);
	}
}
