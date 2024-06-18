import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o valor do lado do quadrado: ");
		float lado = entrada.nextFloat();
		float area = lado * lado;
		System.out.println("O número informado foi: " + area);
		
		entrada.close();
	}

}