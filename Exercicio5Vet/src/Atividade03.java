import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 4;
		float[] notas = new float[TAM];
		float soma = 0;
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira uma das nota: ");
			notas[x] = entrada.nextFloat();
			soma += notas[x];
		}
		
		float media = soma / TAM;
		
		for (int x = 0; x < TAM; x++) {
			System.out.println(notas[x]);
		}
		
		System.out.println("Média: " + media);
		
		entrada.close();
	}
	
}
