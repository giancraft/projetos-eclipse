package Atv30_37;

import java.util.Scanner;

public class Atividade35 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Especificação   Código   Preço");
		System.out.println("Cachorro Quente  100     R$ 1,20");
		System.out.println("Bauru Simples    101     R$ 1,30");
		System.out.println("Bauru com Ovo    102     R$ 1,50");
		System.out.println("Hambúrguer       103     R$ 1,20");
		System.out.println("Cheeseburguer    104     R$ 1,30");
		System.out.println("Refrigerante     105     R$ 1,00");
		
		int codigo = 1;
		int quantidade;
		float total = 0;
		
		while (codigo != 0) {
			System.out.print("Insira o código do pedido (caso tenha concluído, digite 0): ");
			codigo = entrada.nextInt();
			if (codigo !=0) {
				System.out.print("Insira a quantidade desejada: ");
				quantidade = entrada.nextInt();
			
				if (codigo == 100)
					total += ((float) 1.2 * quantidade);
				else if (codigo == 101)
					total += ((float) 1.3 * quantidade);
				else if (codigo == 102)
					total += ((float) 1.5 * quantidade);
				else if (codigo == 103)
					total += ((float) 1.2 * quantidade);
				else if (codigo == 104)
					total += ((float) 1.3 * quantidade);
				else if (codigo == 105)
					total += (1 * quantidade);
			}
		}
		
		System.out.println("Total a pagar: " + total);
		
		entrada.close();
	}

}
