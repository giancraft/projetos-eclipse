package Atv30_37;

import java.util.Scanner;

public class Atividade32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int codigo;
		int codigoMaior = 0;
		int codigoMenor = 0;
		int numVeiculos;
		int numAcidentes;
		int acidentesMaior = 0;
		int acidentesMenor = 0;
		int somaVeiculos = 0;
		int somaAcidentes = 0;
		
		for (int x = 0; x < 5; x++) {
			System.out.print("Insira o código da cidade: ");
			codigo = entrada.nextInt();
			System.out.print("Insira o número de veículos: ");
			numVeiculos = entrada.nextInt();
			
			while (numVeiculos > 1999) {
				System.out.println("Valor inválido.");
				System.out.print("Insira o número de veículos novamente: ");
				numVeiculos = entrada.nextInt();
			}
			
			System.out.print("Insira o número de acidentes com vítimas: ");
			numAcidentes = entrada.nextInt();
			
			while (numAcidentes > 1999) {
				System.out.println("Valor inválido.");
				System.out.print("Insira o número de acidentes com vítimas novamente: ");
				numAcidentes = entrada.nextInt();
			}
			
			if (x == 0) {
				acidentesMaior = numAcidentes;
				codigoMaior = codigo;
				acidentesMenor = numAcidentes;
				codigoMenor = codigo;
			} else {
				if (numAcidentes > acidentesMaior) {
					acidentesMaior = numAcidentes;
					codigoMaior = codigo;
				}
				
				if (numAcidentes < acidentesMenor) {
					acidentesMenor = numAcidentes;
					codigoMenor = codigo;
				}
			}
			
			somaVeiculos += numVeiculos;
			somaAcidentes += numAcidentes;
		}
		
		float mediaVeiculos = somaVeiculos / 5;
		float mediaAcidentes = somaAcidentes / 5;
		
		System.out.println("A cidade com maior índice de acidentes é a " + codigoMaior
				+ " e o número de acidentes é " + acidentesMaior);
		System.out.println("A cidade com menor índice de acidentes é a " + codigoMenor
				+ " e o número de acidentes é " + acidentesMenor);
		System.out.println("Média de veículos nas cidades: " + mediaVeiculos);
		System.out.println("Média de acidentes nas cidades: " + mediaAcidentes);
		
		entrada.close();
	}
	
}
