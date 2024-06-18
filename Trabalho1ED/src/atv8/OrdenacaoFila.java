package atv8;

public class OrdenacaoFila {
	private Nodo inicio;
	private Nodo fim;
	private int limite;
	private int tamanho = 0;
	
	public OrdenacaoFila(int limite) {
		this.limite = limite;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public Nodo getInicio() {
		if (!estaVazio()) return inicio;
		else {
			System.out.println("Fila está vazia");
			return null;
		}
	}
	
	public void inserir(int dado) {
		if(temEspaco()) {
			Nodo novoItem = new Nodo(dado);
			if(estaVazio()) {
				inicio = novoItem;
				fim = novoItem;
			} else {
				fim.setProx(novoItem);
				fim = novoItem;
			}
			tamanho++;
		} else
			System.out.println("Fila cheia!");
	}
	
	public Integer remover() {
		if (estaVazio()) return null;
		int valor = inicio.getDado();
		inicio = inicio.getProx();
		tamanho--;
		if (estaVazio()) {
			fim = null;
		}
		return valor;
	}
	
	public void organizaFila() {
		Nodo aux = inicio;
		OrdenacaoFila fPares = new OrdenacaoFila(limite);
		OrdenacaoFila fImpares = new OrdenacaoFila(limite);
		System.out.println("Fila Original:");
		while (aux != null) {
			if (aux.getDado() % 2 == 0) 
				fPares.inserir(aux.getDado());
			else
				fImpares.inserir(aux.getDado());
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}
		aux = fPares.getInicio();
		System.out.println("\nFila de Pares:");
		while (aux != null) {
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}
		aux = fImpares.getInicio();
		System.out.println("\nFila de Ímpares: ");
		while (aux != null) {
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}
	}
}
