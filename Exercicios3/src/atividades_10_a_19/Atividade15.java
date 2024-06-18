package atividades_10_a_19;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o preço de custo de um produto: ");
		float preco = entrada.nextFloat();
		System.out.print("Insira o código de um produto: ");
		int codigo = entrada.nextInt();
		
		if (codigo == 1)
			System.out.println("O produto desse código vem do Sul e possui o preço"
			+ " R$ " + preco);
		else if (codigo == 2)
			System.out.println("O produto desse código vem do Norte e possui o preço"
			+ " R$ " + preco);
		else if (codigo == 3)
			System.out.println("O produto desse código vem do Leste e possui o preço"
			+ " R$ " + preco);
		else if (codigo == 4)
			System.out.println("O produto desse código vem do Oeste e possui o preço"
			+ " R$ " + preco);
		else if (codigo == 5 || codigo == 6)
			System.out.println("O produto desse código vem do Nordeste e possui o preço"
			+ " R$ " + preco);
		else if (codigo == 7 || codigo == 8)
			System.out.println("O produto desse código vem do Centro-Oeste e possui o preço"
			+ " R$ " + preco);
		else
			System.out.println("O produto desse código vem do Exterior e possui o preço"
			+ " R$ " + preco);
		
		entrada.close();
	}

}