package Atv20_29;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o número de pessoas que utilizarão o programa: ");
		int tamanho = entrada.nextInt();
		int soma = 0;
		
		for (int x = 0; x < tamanho; x++) {
			System.out.print("Insira sua idade: ");
			int idade = entrada.nextInt();
			soma += idade;
		}
		
		float media = soma / tamanho;
		
		if (media > 0 && media <= 25)
			System.out.println("A turma é jovem");
		else if (media >= 26 && media <= 60) {
			System.out.println("A turma é  adulta");
		} else
			System.out.println("A turma é idosa");
		
		entrada.close();
	}
	
}
