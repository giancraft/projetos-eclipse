package Atv1_9;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Insira sua senha: ");
		String senha = entrada.nextLine();
		
		while (nome.equals(senha)) {
			System.out.println("Erro. Nome igual a senha");
			System.out.print("Insira seu nome novamente: ");
			nome = entrada.nextLine();
			System.out.print("Insira sua senha novamente: ");
			senha = entrada.nextLine();
		}
		
		System.out.println("Dados arquivados com sucesso!");
		
		entrada.close();
	}
	
}
