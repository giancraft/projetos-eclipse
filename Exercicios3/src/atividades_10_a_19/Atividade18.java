package atividades_10_a_19;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro lado do triângulo: ");
		float lado1 = entrada.nextFloat();
		System.out.print("Insira o segundo lado do triângulo: ");
		float lado2 = entrada.nextFloat();
		System.out.print("Insira o terceiro lado do triângulo: ");
		float lado3 = entrada.nextFloat();
		float soma1 = lado1 + lado2;
		float soma2 = lado1 + lado3;
		float soma3 = lado2 + lado3;
		
		if (soma1 > lado3 || soma2 > lado2 || soma3 > lado1) {
			if (lado1 == lado2 && lado1 == lado3)
				System.out.println("O triângulo é equilátero");
			else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
				System.out.println("O triângulo é isósceles");
			else
				System.out.println("O triângulo é escaleno");
		} else
			System.out.println("Não é um triângulo");
		
		entrada.close();
	}

}