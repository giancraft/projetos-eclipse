import java.util.Scanner;
import java.util.Random;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		String[] senha = {"a", "e", "i", "o", "u", "f", "g", "h", "b", "j", "k", "l",
				"m", "n", "c", "p", "q", "r", "s", "t", "d", "v", "w", "x", "y", "z"};
		String senhaGerada = "";
		int num;
		
		System.out.print("Insira o tamanho da senha: ");
		int tamanho = entrada.nextInt();
		
		for (int x = 0; x < tamanho; x++) {
			if (x % 2 == 0) {
				num = aleatorio.nextInt(6, 26);
				senhaGerada += senha[num];
			} else {
				num = aleatorio.nextInt(0, 5);
				senhaGerada += senha[num];
			}
		}
		
		System.out.println("Senha: " + senhaGerada);
		
		entrada.close();
	}
	
}
