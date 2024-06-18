import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da matriz em um número ímpar de 3 à 11: ");
		int num = entrada.nextInt();
		
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int contadorPar = 0;
		int contadorImpar = 0;
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		
		while (num < 3 || num % 2 == 0 || num > 11) {
			System.out.println("Número inválido.");
			System.out.print("Insira novamente outro número: ");
			num = entrada.nextInt();
		} 
		
		int[][] numeros = new int[num][num];
		
		for (int x = 0; x < num; x++) {
			for (int i = 0; i < num; i++) {
				System.out.print("Insira um dos números: ");
				numeros[x][i] = entrada.nextInt();
				soma += numeros[x][i];
				
				if (x == 0 && i == 0) {
					maior = numeros[x][i];
					menor = numeros[x][i];
				} else if (numeros[x][i] > maior)
					maior = numeros[x][i];
				else if (numeros[x][i] < menor)
					menor = numeros[x][i];
				
				if (numeros[x][i] % 2 == 0)
					contadorPar = numeros[x][i];
				else
					contadorImpar = numeros[x][i];
				
				if (x == i)
					somaPrincipal += numeros[x][i];
				
				if (x + i == num - 1)
					somaSecundaria += numeros[x][i];
			}
		}
		
		int media = soma / (num * num);
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + new DecimalFormat("#,##0.00").format(media));
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Contador par: " + contadorPar);
		System.out.println("Contador ímpar: " + contadorImpar);
		System.out.println("Soma da diagonal principal: " + somaPrincipal);
		System.out.println("Soma da diagonal secundária: " + somaSecundaria);
		System.out.println("Matriz: ");
		
		for (int x = 0; x < num; x++) {
			System.out.print("| ");
			for (int i = 0; i < num; i++) {
				System.out.print(numeros[x][i] + " ");
			}
			System.out.print("|");
			System.out.println("");
		}
		
		entrada.close();
	}
	
}
