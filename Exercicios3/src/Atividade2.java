import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		if (num > 0)
			System.out.println("O número é positivo.");
		else if (num < 0)
			System.out.println("O número é negativo.");
		else
			System.out.println("O número é zero.");
		
		entrada.close();
	}

}