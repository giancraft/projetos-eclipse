import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma letra: ");
		String letra = entrada.nextLine();
		if (letra.equals("F"))
			System.out.println("F - Feminino.");
		else if (letra.equals("M"))
			System.out.println("M - Masculino");
		else
			System.out.println("Letra inválida");
		
		entrada.close();
	}

}