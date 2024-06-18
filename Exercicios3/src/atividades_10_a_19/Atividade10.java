package atividades_10_a_19;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num3 = entrada.nextInt();
		if (num1 > num2 && num1 > num3)
			if (num2 > num3)
				System.out.println("O maior número é " + num1 + " e o menor é " + num3);
			else
				System.out.println("O maior número é " + num1 + " e o menor é " + num2);
		else if (num2 > num1 && num2 > num3)
			if (num1 > num3)
				System.out.println("O maior número é " + num2 + " e o menor é " + num3);
			else
				System.out.println("O maior número é " + num2 + " e o menor é " + num1);
		else if (num3 > num1 && num3 > num2)
			if (num1 > num2)
				System.out.println("O maior número é " + num3 + " e o menor é " + num2);
			else
				System.out.println("O maior número é " + num3 + " e o menor é " + num1);
		
		entrada.close();
	}

}