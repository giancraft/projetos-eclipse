package Atv30_37;

import java.util.Scanner;

public class Atividade36 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int voto = 1;
		int votosPedro = 0;
		int votosJose = 0;
		int votosRafael = 0;
		int votosIgor = 0;
		int nulo = 0;
		int branco = 0;
		int contador = 0;
		
		while(voto != 0) {
			System.out.print("Escolha um candidato (1 - Pedro, 2 - José, 3 - Rafael, "
					+ "4 - Igor, 5 - nulo, 6 - branco): ");
			voto = entrada.nextInt();
			if (voto != 0) {
				contador++;
			
				if (voto == 1)
					votosPedro++;
				else if (voto == 2)
					votosJose++;
				else if (voto == 3)
					votosRafael++;
				else if (voto == 4)
					votosIgor++;
				else if (voto == 5)
					nulo++;
				else if (voto == 6)
					branco++;
			}
		}
		
		float percNulo = nulo / contador;
		float percBranco = branco / contador;
		
		System.out.println("Total de votos de Pedro: " + votosPedro);
		System.out.println("Total de votos de Jose: " + votosJose);
		System.out.println("Total de votos de Rafael: " + votosRafael);
		System.out.println("Total de votos de Igor: " + votosIgor);
		System.out.println("Total de votos Nulos: " + nulo);
		System.out.println("Total de votos em Branco: " + branco);
		System.out.println("Porcentagem de votos nulos: " + percNulo);
		System.out.println("Porcentagem de votos em branco: " + percBranco);
		
		entrada.close();
	}

}
