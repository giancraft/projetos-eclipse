package atv3;

public class Main {

	public static void main(String[] args) {
		ListaOperacoes lista = new ListaOperacoes();
		
		lista.inserirInicio(5);
		lista.inserirInicio(13);
		lista.inserirInicio(-3);
		
		System.out.println(lista.mostrarLista());
		
		lista.calculos();

	}

}
