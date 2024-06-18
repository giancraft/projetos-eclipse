package Atv30_37;

import java.util.Scanner;

public class Atividade30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int contador = 0;
		int codigo = 1;
		int codigoMagro = 0;
		int codigoGordo = 0;
		int codigoMenor = 0;
		int codigoMaior = 0;
		float peso;
		float pesoMagro = 0;
		float pesoGordo = 0;
		float altura;
		float alturaMenor = 0;
		float alturaMaior = 0;
		float somaPeso = 0;
		float somaAltura = 0;
		
		while (codigo != 0) {
			System.out.print("Insira o código do cliente: ");
			codigo = entrada.nextInt();
			if (codigo != 0) {
				System.out.print("Insira seu peso: ");
				peso = entrada.nextFloat();
				System.out.print("Insira sua altura: ");
				altura = entrada.nextFloat();
				
				if (contador == 0) {
					alturaMaior = altura;
					codigoMaior = codigo;
					alturaMenor = altura;
					codigoMenor = codigo;
					pesoGordo = peso;
					codigoGordo = codigo;
					pesoMagro = peso;
					codigoMagro = codigo;
				} else {
					if (altura > alturaMaior) {
						alturaMaior = altura;
						codigoMaior = codigo;
					} else if (altura < alturaMenor) {
						alturaMenor = altura;
						codigoMenor = codigo;
					}
				
					if (peso > pesoGordo) {
						pesoGordo = peso;
						codigoGordo = codigo;
					} else if (peso < pesoMagro) {
						pesoMagro = peso;
						codigoMagro = codigo;
					}
				}
				somaAltura += altura;
				somaPeso += peso;
				
				contador++;
			}
		}
		
		float mediaAltura = somaAltura / contador;
		float mediaPeso = somaPeso / contador;
		
		System.out.println("Código e altura do mais alto: " + codigoMaior + ", " + alturaMaior);
		System.out.println("Código e altura do mais baixo: " + codigoMenor + ", " + alturaMenor);
		System.out.println("Código e altura do mais gordo: " + codigoGordo + ", " + pesoGordo);
		System.out.println("Código e altura do mais magro: " + codigoMagro + ", " + pesoMagro);
		System.out.println("Média das altura: " + mediaAltura);
		System.out.println("Média dos pesos: " + mediaPeso);
		
		entrada.close();
	}
	
}
