package atv9;

public class Main {
	public static void main(String[] args) {
		OrdenacaoFuncionarios funs = new OrdenacaoFuncionarios();
		
		funs.inserirInicio("Gianluca", 1230.4f);
		funs.inserirInicio("Pedro Ryan", 1537.3f);
		funs.inserirInicio("Pedro Henrique", 1537.3f);
		funs.inserirInicio("Igor", 0f);
		funs.inserirInicio("Leo", 1190.4f);
		
		funs.ordenaLista(1200f);
	}
	
}
