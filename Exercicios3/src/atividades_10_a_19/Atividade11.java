package atividades_10_a_19;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o turno em que você estuda: ");
		String turno = entrada.nextLine();
		while (!(turno.equals("M")) && !(turno.equals("V")) && !(turno.equals("N"))) {
			System.out.println("Turno inválido");
			System.out.print("Insira um turno válido: ");
			turno = entrada.nextLine();
		}
		
		if (turno.equals("M"))
			System.out.println("Bom dia!");
		else if (turno.equals("V"))
			System.out.println("Boa tarde!");
		else
			System.out.println("Boa noite!");
		
		entrada.close();
	}

}