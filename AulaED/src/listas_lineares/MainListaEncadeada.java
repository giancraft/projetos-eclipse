package listas_lineares;

public class MainListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.inserirInicio(5);
		lista.inserirInicio(7);
		lista.inserirInicio(4);
		lista.inserirInicio(9);
		
		/*lista.inserirFinal(5);
		lista.inserirFinal(7);
		lista.inserirFinal(4);*/
		
		lista.mostrarLista();
		lista.contadorNodos();
		lista.procurarValor(5);
		/*lista.deleteComValor(5);
		
		lista.mostrarLista();*/

	}

}
