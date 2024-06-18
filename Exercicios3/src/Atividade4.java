import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um ano de 4 dígitos: ");
		int ano = entrada.nextInt();;
		while (ano < 1000 || ano > 9999) {
			System.out.print("Insira um ano válido: ");
			ano = entrada.nextInt();
		}
		
		if (ano % 4 == 0)
			System.out.println("O ano é bissesto.");
		else
			System.out.println("O ano não é bissesto.");
		
		entrada.close();
	}

}