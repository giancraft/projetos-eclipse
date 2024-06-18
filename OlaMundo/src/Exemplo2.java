import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 2;
		int soma = 0;
		int quantidade = 0;
		
		while (num != 0) {
			System.out.print("Insira um número: ");
			num = entrada.nextInt();
			if (num != 0) {
				soma += num;
				quantidade++;
			}
		}
		
		float media = (float) soma / quantidade;
		
		System.out.println("Soma: " + soma);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Média: " + media);
		
		entrada.close();
	}

}