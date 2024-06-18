import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		char[] alfabeto = new char[TAM];
		int contador = 0;
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira uma letra do alfabeto: ");
			alfabeto[x] = entrada.nextLine().charAt(0);
			
			if (!(alfabeto[x] == 'a' || alfabeto[x] == 'A' || alfabeto[x] == 'e' ||
				alfabeto[x] == 'E' || alfabeto[x] == 'i' || alfabeto[x] == 'I' ||
				alfabeto[x] == 'o' || alfabeto[x] == 'O' || alfabeto[x] == 'u' ||
				alfabeto[x] == 'U')) {
				contador++;
			}
		}
		
		System.out.println("O número de consoantes é: " + contador);
		for (int x = 0; x < TAM; x++) {
			if (!(alfabeto[x] == 'a' || alfabeto[x] == 'A' || alfabeto[x] == 'e' ||
				alfabeto[x] == 'E' || alfabeto[x] == 'i' || alfabeto[x] == 'I' ||
				alfabeto[x] == 'o' || alfabeto[x] == 'O' || alfabeto[x] == 'u' ||
				alfabeto[x] == 'U')) {
				System.out.println(alfabeto[x]);	
			}
		}
		
		entrada.close();
	}
	
}
