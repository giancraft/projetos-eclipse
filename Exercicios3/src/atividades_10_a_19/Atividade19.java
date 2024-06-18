package atividades_10_a_19;

import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o valor de 'a': ");
		float a = entrada.nextFloat();
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau.");
		} else {
			System.out.print("Insira o valor de 'b': ");
			float b = entrada.nextFloat();
			System.out.print("Insira o valor de 'c': ");
			float c = entrada.nextFloat();
			double delta = Math.pow(b, 2) - 4 * a * c;
			double x1 = (-b + Math.sqrt(delta)) / 2 * a;
			double x2 = (-b - Math.sqrt(delta)) / 2 * a;
			
			if (delta < 0)
				System.out.println("A equação não possui raízes reais.");
			else if (delta == 0)
				System.out.println("A equação possui apenas uma raíz que é: " + x1);
			else
				System.out.println("A equação possui x1 = " + x1 + "e x2 = " + x2);
		}
		
		entrada.close();
	}

}