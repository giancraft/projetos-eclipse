package Atv20_29;

import java.util.Scanner;

public class Atividade23 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o número total de turmas: ");
		int total = entrada.nextInt();
		
		int turma;
		int soma = 0;
		
		for (int x = 0; x < total; x++) {
			System.out.print("Quantos alunos tem a turma " + (x+1) + ": ");
			turma = entrada.nextInt();
			
			while (turma > 40) {
				System.out.println("Número de alunos inválido. O número máximo é 40");
				System.out.print("Insira uma quantidade válida: ");
				turma = entrada.nextInt();
			}
			
			soma += turma;
		}
		
		int media = soma / total;
		System.out.println("O número médio de alunos por turma é: " + media);
		
		entrada.close();
	}

}
