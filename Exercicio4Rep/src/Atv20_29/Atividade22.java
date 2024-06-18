package Atv20_29;

import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira o número de votantes: ");
		int votantes = entrada.nextInt();
		int voto;
		int votosPedro = 0;
		int votosJose = 0;
		int votosRafael = 0;
		
		for (int x = 0; x < votantes; x++) {
			System.out.print("votante " + (x+1) + " escolha seu candidato (1 - Pedro,"
					+ " 2 - José, 3 - Rafael): ");
			voto = entrada.nextInt();
			
			while (voto != 1 && voto != 2 && voto != 3) {
				System.out.println("Opção inválida.");
				System.out.print("Insira uma opção válida: ");
				voto = entrada.nextInt();
			}
			
			if (voto == 1)
				votosPedro++;
			else if (voto == 2)
				votosJose++;
			else
				votosRafael++;
		}
		
		System.out.println("Votos de Pedro: " + votosPedro);
		System.out.println("Votos de José: " + votosJose);
		System.out.println("Votos de Rafael: " + votosRafael);
		
		entrada.close();
	}
	
}
