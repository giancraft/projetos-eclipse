package Atv10_19;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int[] num = new int[10];
		int contPar = 0;
		int contImpar = 0;
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Insira um número: ");
			num[x] = entrada.nextInt();
			
			if (num[x] % 2 == 0)
				contPar++;
			else
				contImpar++;
		}
		
		System.out.println("Números pares: " + contPar + ". Números ímpares: " + contImpar);
		
		entrada.close();
	}
	
}
