package atv8;

public class Main {

	public static void main(String[] args) {
		OrdenacaoFila f = new OrdenacaoFila(10);
		
		f.inserir(2);
		f.inserir(3);
		f.inserir(8);
		f.inserir(7);
		f.inserir(4);
		
		f.organizaFila();
	}

}
