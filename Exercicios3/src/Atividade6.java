import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			num++;
			System.out.println("Transformando em ímpar: " + num);
		} else {
			num++;
			System.out.println("Transformando em par: " + num);
		}
		entrada.close();
	}

}