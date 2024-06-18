import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma letra: ");
		String letra = entrada.nextLine();
		if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") ||
			letra.equals("U") || letra.equals("a") || letra.equals("e") || letra.equals("o") ||
			letra.equals("u"))
			System.out.println("A letra é uma vogal");
		else
			System.out.println("A letra é consoante");
		
		entrada.close();
	}

}