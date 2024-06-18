import java.util.Scanner;

public class Atividade09 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um texto: ");
		String texto = entrada.nextLine();
		
		char[] caracteres = new char[texto.length()];
		
		for (int x = 0; x < texto.length(); x++) {
			caracteres[x] = texto.charAt(x);
		}
		
		System.out.println("O texto separado em caracteres é: ");
		for (int x = 0; x < texto.length(); x++) {
			System.out.println(caracteres[x]);
		}
		
		entrada.close();
	}
	
}
