package listas_duplamente_encadeadas;

public class testeListaDuplaEncadeade {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		lista.inserirInicio(1);
		lista.inserirInicio(2);
		lista.inserirInicio(3);
		lista.inserirFinal(0);
		
		System.out.println(lista.mostrarLista());
		
		lista.removeInicio();

		System.out.println(lista.mostrarLista());
	}

}
