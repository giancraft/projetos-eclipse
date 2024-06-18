package Atv1_9;

import java.util.Scanner;

public class Atividade9 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		do {
			System.out.print("Insira um número de 1 a 10: ");
			num = entrada.nextInt();
		} while (num < 1 || num > 10);
		
		for (int x = 1; x <= 10; x++) {
			System.out.println(num + " x " + x + " = " + num * x);
		}
		
		entrada.close();
	}
	
}
