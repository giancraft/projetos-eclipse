package Atv20_29;

import java.util.Scanner;

public class Atividade27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int contador = 1;
		float preco = 1;
		float soma = 0;
		
		System.out.println("Lojas Tabajara");
		while (preco != 0) {
			System.out.print("Produto " + contador + ": R$ ");
			preco = entrada.nextFloat();
			soma += preco;
			contador++;
		}
		
		System.out.println("Total: R$ " + soma);
		System.out.print("Dinheiro: ");
		float troco = entrada.nextFloat();
		System.out.println("Troco: " + (troco - soma));
		
		entrada.close();
	}
	
}
