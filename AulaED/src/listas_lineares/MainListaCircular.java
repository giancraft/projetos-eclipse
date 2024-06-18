package listas_lineares;

public class MainListaCircular {

	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		
		lista.inserirInicio(5);
		lista.inserirInicio(8);
		lista.inserirInicio(3);
		
		/*lista.inserirFinal(5);
		lista.inserirFinal(8);
		lista.inserirFinal(3);*/
		
		System.out.println(lista.mostrarLista());
		lista.buscarPosicao(5);
		
		/*lista.deleteComValor(8);
		
		System.out.println(lista.mostrarLista());*/

	}

}
