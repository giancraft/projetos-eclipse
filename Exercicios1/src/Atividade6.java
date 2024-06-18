import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o raio do círculo: ");
		float raio = entrada.nextFloat();
		double area = 3.14 * raio * raio;
		System.out.println("O número informado foi: " + area);
		
		entrada.close();
	}

}