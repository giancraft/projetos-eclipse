package Atv20_29;

import java.util.Scanner;

public class Atividade29 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o número a ser feito a tabuada: ");
		int num = entrada.nextInt();
		
		System.out.print("A partir de que número deve-se começar o cálculo: ");
		int min = entrada.nextInt();
		System.out.print("E em qual deve-se terminar: ");
		int max = entrada.nextInt();
		
		while (min > max) {
			System.out.println("o valor mínimo não pode ser maior que o máximo.");
			System.out.print("Insira o valor mínimo novamente: ");
			min = entrada.nextInt();
			System.out.println("Agora insira o valor máximo novamente: ");
			max = entrada.nextInt();
		}

		System.out.println("Vou montar a tabuada de " + num + " começando em " + min
				+ " e terminando em " + max);
		for (int x = min; x <= max; x++) {
			System.out.println(num + " x " + x + " = " + (num * x));
		}
		
		entrada.close();
	}

}
