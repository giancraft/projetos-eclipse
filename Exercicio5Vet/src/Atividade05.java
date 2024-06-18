import java.util.Scanner;

public class Atividade05 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 20;
		int[] nums = new int[TAM];
		int[] pares = new int[TAM];
		int[] impares = new int[TAM];
		int i = 0;
		int z = 0;
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira um dos números: ");
			nums[x] = entrada.nextInt();
			
			if (nums[x] % 2 == 0) {
				pares[i] = nums[x];
				i++;
			} else {
				impares[z] = nums[x];
				z++;
			}
		}
		
		for (int x = 0; x < TAM; x++) {
			System.out.println(nums[x]);
		}
		
		System.out.println("Pares: ");
		for (int x = 0; x < i; x++) {
			System.out.println(pares[x]);
		}
		
		System.out.println("Ímpares: ");
		for (int x = 0; x < z; x++) {
			System.out.println(impares[x]);
		}
		
		entrada.close();
	}
	
}
