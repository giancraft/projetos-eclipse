package atividades_20_29;

import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		int centenas;
		int dezenas;
		int unidades;
		
		if (num < 1000 && num > -1000) {
			centenas = num / 100;
			dezenas = (num % 100) / 10;
			unidades = ((num % 100) % 10);
			System.out.println("Centenas: " + centenas + ". Dezenas: " + dezenas +
					". Unidades: " + unidades);
		} else
			System.out.println("O maior número é: ");
		
		entrada.close();
	}

}
