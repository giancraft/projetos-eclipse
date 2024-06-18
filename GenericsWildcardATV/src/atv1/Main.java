package atv1;

public class Main {

	public static void main(String[] args) {
		
		String str = "Oi";
		Generic<String> string = new Generic<>(str);
		System.out.println(string.getType());
		
		Integer inte = 13;
		Generic<Integer> integer = new Generic<>(inte);
		System.out.println(integer.getType());
		
		Generic<Livro> livro = new Generic<>(new Livro("Frank Herbert", "Messias de Duna", "Ficção Científica", 345));
		System.out.println(livro.getType());

	}

}
