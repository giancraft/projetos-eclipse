package Atv10_19;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o limite de número da sequência de Fibonacci: ");
		int limite = entrada.nextInt();
		int soma = 1;
		int anterior = 1;
		int anterior2 = 0;
		
		for (int x = 0; x < limite; x++) {
			if (x == limite - 1) {
				anterior2 = soma;
				soma += anterior;
				anterior = anterior2;
				System.out.print(soma + ".");
			} else {
				if (x == 0 || x == 1)
					System.out.print(soma + ", ");
				else if (x == 2) {
					soma += anterior;
					System.out.print(soma + ", ");
				} else {
					anterior2 = soma;
					soma += anterior;
					anterior = anterior2;
					System.out.print(soma + ", ");
				}
			}
		}
		
		entrada.close();
	}
	
}
