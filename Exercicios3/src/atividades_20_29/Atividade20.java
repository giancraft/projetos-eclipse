package atividades_20_29;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um ano: ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0)
			System.out.println("O ano é bissesto");
		else
			System.out.println("O ano não é bissesto");
		
		entrada.close();
	}

}