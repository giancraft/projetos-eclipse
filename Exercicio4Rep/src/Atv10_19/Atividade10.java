package Atv10_19;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int potencia = 1;
		
		System.out.print("Insira um número: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = entrada.nextInt();
		
		for (int x = 1; x <= num2; x++) {
			potencia *= num1;
		}
		
		System.out.println(num1 + " ^ " + num2 + " = " + potencia);
		
		entrada.close();
	}
	
}
