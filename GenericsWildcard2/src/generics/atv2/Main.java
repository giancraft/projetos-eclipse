package generics.atv2;

public class Main {

	public static void main(String[] args) {
		
		Livro<String> livro = new Livro<>();
		
		Capitulo<String> capitulo = new Capitulo<>(1, "Uma Festa Inesperada");
		Capitulo<String> capitulo2 = new Capitulo<>(1, "Uma Festa Muito Mais que Esperada");
		
		livro.escrever(capitulo);
		livro.escrever(capitulo2);
		
		System.out.println(livro.mostrarLista());

	}

}
