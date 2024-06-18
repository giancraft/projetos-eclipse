package Atv10_19;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		
		if ((num == 2) || (num == 3) || (num == 5) || (num == 7))
			System.out.println("É primo");
		else if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 ==0) || (num % 7 == 0))
			System.out.println("Não é primo");
		else
			System.out.println("É primo");
		
		entrada.close();
	}
	
}
