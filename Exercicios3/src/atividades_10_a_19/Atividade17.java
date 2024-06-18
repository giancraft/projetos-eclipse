package atividades_10_a_19;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a sua segunda nota: ");
		float nota2 = entrada.nextFloat();
		float media = (nota1 + nota2) / 2;
		System.out.println("Sua primeira nota é: " + nota1);
		System.out.println("Sua segunda nota é: " + nota2);
		System.out.println("Sua média é: " + media);	
		
		if (media >=0 && media < 6) {
			if (media < 4)
				System.out.println("Conceito: E");
			else if (media >= 4)
				System.out.println("Conceito: D");
			System.out.println("Reprovado");
		} else if (media >= 6 && media <= 10) {
			if (media < 7.5)
				System.out.println("Conceito: C");
			else if (media >= 7.5 && media < 9)
				System.out.println("Conceito: B");
			else if (media >= 9)
				System.out.println("Conceito: A");
			System.out.println("Aprovado");
		} else {
			System.out.println("Média Inválida");
		}
		entrada.close();
	}

}