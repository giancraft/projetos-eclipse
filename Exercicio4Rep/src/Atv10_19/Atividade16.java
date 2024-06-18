package Atv10_19;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int maior = 0;
		int menor = 0;
		int soma = 0;
		
		System.out.print("Insira o tamanho do conjunto: ");
		int tamanho = entrada.nextInt();
		
		for (int x = 0; x < tamanho; x++) {
			System.out.print("Insira um número do conjunto: ");
			int num = entrada.nextInt();
			
			if (x == 0) {
				maior = num;
				menor = num;
			} else if (num > maior)
				 maior = num;
			else if (num < menor)
				menor = num;
			
			soma += num;
		}
		
		System.out.println("Menor número: " + menor);
		System.out.println("Maior número: " + maior);
		System.out.println("Soma: " + soma);
		
		entrada.close();
	}
	
}
