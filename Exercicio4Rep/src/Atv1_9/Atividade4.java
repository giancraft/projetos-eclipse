package Atv1_9;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int paisA;
		int paisB;
		int anos = 0;
		float taxaA;
		float taxaB;
		
		do {
			System.out.print("Insira a população do primeiro país: ");
			paisA = entrada.nextInt();
		} while (paisA < 1);
		
		do {
			System.out.print("Insira a população do segundo país: ");
			paisB = entrada.nextInt();
		} while (paisB < 1);
		
		if (paisA < paisB) {
			do {
				do {
					System.out.print("Insira a taxa de crescimento do primeiro país: ");
					taxaA = entrada.nextFloat();
				} while (taxaA < 1);
				do {
					System.out.print("Insira a taxa de crescimento do segundo país: ");
					taxaB = entrada.nextFloat();
				} while (taxaB < 1);
			} while (taxaA < taxaB);
			
			while (paisA < paisB) {
				paisA *= taxaA;
				paisB *= taxaB;
				anos++;
			}
		} else {
			do {
				do {
					System.out.print("Insira a taxa de crescimento do primeiro país: ");
					taxaA = entrada.nextFloat();
				} while (taxaA < 1);
				do {
					System.out.print("Insira a taxa de crescimento do segundo país: ");
					taxaB = entrada.nextFloat();
				} while (taxaB < 1);
			} while (taxaB < taxaA);
			
			while (paisB < paisA) {
				paisA *= taxaA;
				paisB *= taxaB;
				anos++;
			}
		}
		
		System.out.println("Levaram " + anos + " anos.");
		
		entrada.close();
	}
	
}
