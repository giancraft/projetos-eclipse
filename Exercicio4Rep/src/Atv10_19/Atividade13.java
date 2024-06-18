package Atv10_19;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira um número para ser calculado o seu fatorial: ");
		int num = entrada.nextInt();
		int fatorial = num;
		System.out.print(num + "! : ");
		
		for (int x = 0; x < num; x++) {
			if (x == 0) {
				System.out.print(num - x + ".");
			} else {
				fatorial *= num - x;
				System.out.print(num - x + ".");
			}
		}
		
		System.out.print(" = " + fatorial);
		
		entrada.close();
	}
	
}
