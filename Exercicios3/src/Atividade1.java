import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = entrada.nextInt();
		if (num1 > num2)
			System.out.println("O maior número é: " + num1);
		else
			System.out.println("O maior número é: " + num2);
		
		entrada.close();
	}

}