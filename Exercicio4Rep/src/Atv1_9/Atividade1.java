package Atv1_9;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira uma nota: ");
		float nota = entrada.nextFloat();
		while (nota < 0 || nota > 10) {
			System.out.print("Nota inválida. Insira novamente: ");
			nota = entrada.nextFloat();
		}
		System.out.println("Nota recebida.");
		
		entrada.close();
	}
	
}
