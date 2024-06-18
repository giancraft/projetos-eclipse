import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		float[] nums = new float[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira um número: ");
			nums[x] = entrada.nextFloat();
		}
		
		for (int x = TAM - 1; x >= 0; x--) {
			System.out.println(nums[x]);
		}
		
		entrada.close();
	}
	
}
