package Atv20_29;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o número total de notas: ");
		int total = entrada.nextInt();
		float soma = 0;
		
		for (int x = 0; x < total; x++) {
			System.out.print("Insira uma das notas: ");
			float nota = entrada.nextInt();
			soma += nota;
		}
		
		float media = soma / total;
		System.out.println("A sua média é: " + media);
		
		entrada.close();
	}
	
}
