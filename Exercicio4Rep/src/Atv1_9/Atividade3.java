package Atv1_9;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int idade;
		float salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.print("Insira seu nome: ");
			nome = entrada.nextLine();
		} while (nome.length() < 3);
		
		do {
			System.out.print("Insira sua idade: ");
			idade = entrada.nextInt();
		} while (idade < 0 || idade > 150);
		
		do {
			System.out.print("Insira seu salário: ");
			salario = entrada.nextFloat();
		} while (salario < 0);
		
		do {
			System.out.print("Insira seu sexo: ");
			sexo = entrada.nextLine();
		} while (!(sexo.equals("F")) && !(sexo.equals("M")));
		
		do {
			System.out.print("Insira seu estado cívil: ");
			estadoCivil = entrada.nextLine();
		} while (!(estadoCivil.equals("S")) && !(estadoCivil.equals("C")) && 
				!(estadoCivil.equals("V")) && !(estadoCivil.equals("D")));
		
		System.out.println("Dados arquivados com sucesso");
		
		entrada.close();
	}
	
}
