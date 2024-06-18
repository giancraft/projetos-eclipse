package Atv30_37;

import java.util.Scanner;

public class Atividade33 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o valor da dívida: ");
		float divida = entrada.nextFloat();
		int parcelas = 0;
		float juros = 10;
		float valorJuros = divida * (juros / 100);
		float valorParcelas = (divida + valorJuros) / parcelas;
		
		System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela");
		for (int x = 0; x < 5; x++) {
			if (x == 0)
				System.out.println("R$ " + divida + "           0            1                         " + divida);
			else {
				parcelas += 3;
				valorJuros = divida * (juros / 100);
			    valorParcelas = (divida + valorJuros) / parcelas;
				System.out.println("R$ " + (divida+valorJuros) + "          " + juros + "          " + parcelas +
						"                       " + valorParcelas );
				juros += 5;
			}
		}
		
		entrada.close();
	}
	
}
