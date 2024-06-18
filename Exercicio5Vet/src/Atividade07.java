import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 5;
		int[] nums = new int[TAM];
		int soma = 0;
		int multiplicacao = 1;
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira um dos números: ");
			nums[x] = entrada.nextInt();
			soma += nums[x];
			multiplicacao *= nums[x];
		}
		
		System.out.println("Números: ");
		for (int x = 0; x < TAM; x++) {
			System.out.println(nums[x]);
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + multiplicacao);
		
		entrada.close();
	}
	
}
