import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] vet = new int[TAM]; 
		int soma = 0;
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Insira um número: ");
			vet[x] = entrada.nextInt();
			soma += vet[x];
		}
		
		for (int x = 0; x < TAM; x++) {
			System.out.println(vet[x]);
		}
		
		float media = (float) soma / TAM;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		entrada.close();
	}

}