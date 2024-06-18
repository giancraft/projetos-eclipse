import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número inteiro: ");
		int num2 = entrada.nextInt();
		System.out.print("Insira um número real: ");
		float num3 = entrada.nextFloat();
		int operacao1 = (num1 * 2) * (num2 / 2);
		float operacao2 = (num1 * 3) + num3;
		float operacao3 = num3 * num3 * num3;
		System.out.println("Operação a: " + operacao1);
		System.out.println("Operação b: " + operacao2);
		System.out.println("Operação c: " + operacao3);
		
		entrada.close();
	}

}