package atividades_10_a_19;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a sua segunda nota: ");
		float nota2 = entrada.nextFloat();
		float media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: " + media);		
		if (media >= 0 && media <= 3)
			System.out.println("Reprovado");
		else if (media > 3 && media <= 6.9)
			System.out.println("Em Exame");
		else
			System.out.println("Aprovado");
		
		entrada.close();
	}

}