import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		System.out.print("Insira um número entre 1 e 10: ");
		int num = entrada.nextInt();
		
		while (num < 1 || num > 10) {
			System.out.println("Número inválido. Digite um número válido: ");
			num = entrada.nextInt();
		}
			
		for (int x = 0; x <= TAM; x++)
			System.out.println(num + " x " + x + " = " + (num*x));

		entrada.close();
	}

}
