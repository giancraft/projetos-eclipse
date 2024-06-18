package atv2;

public class Main {

	public static void main(String[] args) {
		ListaProdutos lista = new ListaProdutos();
		
		lista.inserirInicio(3, 20.0f, 120);
		lista.inserirInicio(5, 30.0f, 30);
		lista.inserirInicio(8, 5.85f, 300);
		
		lista.inserirDesconto(10);
		lista.aplicarDesconto();

	}

}
