import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = entrada.nextInt();
		int soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		entrada.close();
	}

}
