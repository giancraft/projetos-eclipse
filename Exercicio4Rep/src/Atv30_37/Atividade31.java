package Atv30_37;

import java.util.Scanner;

public class Atividade31 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int numAluno;
		int numMaior = 0;
		int numMenor = 0;
		float altura;
		float alturaMaior = 0;
		float alturaMenor = 0;
		
		for (int x = 0; x < 10; x++) {
			System.out.print("Insira o número do aluno: ");
			numAluno = entrada.nextInt();
			System.out.print("Insira a sua altura em centímetros: ");
			altura = entrada.nextFloat();
			
			if (x == 0) {
				alturaMaior = altura;
				alturaMenor = altura;
				numMaior = numAluno;
				numMenor = numAluno;
			} else {
				if (altura > alturaMaior) {
					alturaMaior = altura;
					numMaior = numAluno;
				}
				
				if (altura < alturaMenor) {
					alturaMenor = altura;
					numMenor = numAluno;
				}
			}
		}
		
		System.out.println("O maior aluno é o " + numMaior + " e sua altura é " + alturaMaior);
		System.out.println("O menor aluno é o " + numMenor + " e sua altura é " + alturaMenor);
		
		entrada.close();
	}

}
