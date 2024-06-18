package Atv10_19;

import java.util.Scanner;

public class Atividade14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o número de termos da série: ");
		int num = entrada.nextInt();
		int div = 1;
			
		for (int x = 1; x <= num; x++) {
			if (x == 1)
				System.out.print("S = 1/1 + ");
			else if (x < num)
				System.out.print(+ x + "/" + (div+=2) + " + ");
			else
				System.out.print(+ x + "/" + (div+=2));
		}
		
		entrada.close();
	}
}
