package Atv20_29;

import java.util.Scanner;

public class Atividade26 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o preço do pão: ");
		float preco = entrada.nextFloat(); 
		
		System.out.println("Preço do pão: " + preco);
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for (int x = 1; x <= 50; x++) {
			System.out.println(x + " - R$ " + preco * x); 	
		}
		
		entrada.close();
	}

}