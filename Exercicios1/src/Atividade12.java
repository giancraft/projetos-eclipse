import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua altura: ");
		float altura = entrada.nextFloat();
		double pesoHomem = (72.7 * altura) - 58;
		double pesoMulher = (62.1 * altura) - 44.7;
		System.out.println("Caso seja homem, seu peso ideal é: " + pesoHomem);
		System.out.println("Caso seja mulher, seu peso ideal é: " + pesoMulher);
		
		entrada.close();
	}

}

