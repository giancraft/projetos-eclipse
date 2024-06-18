import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num = entrada.nextInt();
		System.out.println("O número informado foi: " + num);
		
		entrada.close();
	}

}
