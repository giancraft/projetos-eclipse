import java.util.Scanner;

public class Atividade06 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		float[] media = new float[TAM];
		float nota;
		float soma;
		int contador = 0;
		
		for (int x = 0; x < TAM; x++) {
			soma = 0;
			for (int i = 0; i < 4; i++) {
				System.out.print("Aluno " + (x+1) + ", insira uma das notas: ");
				nota = entrada.nextFloat();
				soma += nota;
			}
			media[x] = soma / 4;
			
			if (media[x] >= 7)
				contador++;
		}
		
		for (int x = 0; x < TAM; x++) {
			System.out.println("Média aluno " + (x+1) + ": " + media[x]);
		}
		
		System.out.println("Número de alunos com média maior ou igual a 7: " + contador);
		
		entrada.close();
	}
	
}
