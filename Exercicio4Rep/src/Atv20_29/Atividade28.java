package Atv20_29;

import java.util.Scanner;

public class Atividade28 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o total de temperaturas a serem lidas: ");
		int total = entrada.nextInt();
		float temperatura;
		float soma = 0;
		float maior = 0;
		float menor = 0;
		
		for (int x = 0; x < total; x++) {
			System.out.print("Insira a " + (x+1) + "º temperatura: ");
			temperatura = entrada.nextFloat();
			
			if (x == 0) {
				maior = temperatura;
				menor = temperatura;
			} else if (temperatura > maior) {
				maior = temperatura;
			} else if (temperatura < menor) {
				menor = temperatura;
			}
			
			soma += temperatura;
		}
		
		float media = soma / total;
		
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Média das temperaturas: " + media);
		
		entrada.close();
	}

}
