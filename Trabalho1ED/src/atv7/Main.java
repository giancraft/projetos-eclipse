package atv7;

public class Main {

	public static void main(String[] args) {
		ListaPrioridade lista = new ListaPrioridade(10) ;
		
		lista.inserir("Gianluca", 3);
		lista.inserir("Pedro Ryan", 2);
		lista.inserir("Igor", 7);
		lista.inserir("Leo", 5);
		
		lista.mostrarLista();
		System.out.println();
		lista.ordenarPacientes();
	}

}
