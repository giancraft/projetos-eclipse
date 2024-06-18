package atividades_10_a_19;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		while (num < 1 || num > 7) {
			System.out.println("Número inválido");
			System.out.print("Insira um número válido: ");
			num = entrada.nextInt();
		}
		
		if (num == 1)
			System.out.println("1 - Domingo");
		else if (num == 2)
			System.out.println("2 - Segunda");
		else if (num == 3)
			System.out.println("3 - Terça");
		else if (num == 4)
			System.out.println("4 - Quarta");
		else if (num == 5)
			System.out.println("5 - Quinta");
		else if (num == 6)
			System.out.println("6 - Sexta");
		else 
			System.out.println("7 - Sábado");
		
		entrada.close();
	}

}