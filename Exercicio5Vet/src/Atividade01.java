import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 5;
		int[] nums = new int[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira um número: ");
			nums[x] = entrada.nextInt();
		}
		
		for (int x = 0; x < TAM; x++) {
			System.out.println(nums[x]);
		}
		
		entrada.close();
	}

}
