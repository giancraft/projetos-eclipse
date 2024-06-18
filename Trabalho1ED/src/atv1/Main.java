package atv1;

public class Main {

	public static void main(String[] args) {
		Desenvolvimento lista = new Desenvolvimento();
		
		lista.inserirInicio(5);
		lista.inserirInicio(4);
		lista.inserirInicio(3);
		lista.inserirInicio(4);
		lista.inserirInicio(4);
		
		lista.mostrarLista();
		lista.funcao(lista.getInicio(), 4);

	}

}
