package Atv20_29;

import java.util.Scanner;

public class Atividade24 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira a quantidade de CDs de sua coleção: ");
		int total = entrada.nextInt();
		float valor;
		float soma = 0;
		
		for (int x = 0; x < total; x++) {
			System.out.print("Insira o preço do " + (x+1) + "º CD: ");
			valor = entrada.nextFloat();
			soma += valor;
		}
		
		float media = soma / total;
		System.out.println("O preço médio gasto por CD foi: " + media);
		
		entrada.close();
	}

}
