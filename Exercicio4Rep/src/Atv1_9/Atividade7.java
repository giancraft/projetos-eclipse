package Atv1_9;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira um número: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = entrada.nextInt();
		
		if (num1 < num2) {
			for (int x = num1 + 1; x < num2; x++) {
				System.out.println(x);
			}
		} else {
			for (int x = num2 + 1; x < num1; x++) {
				System.out.println(x);
			}
		}
		
		entrada.close();
	}
	
}
