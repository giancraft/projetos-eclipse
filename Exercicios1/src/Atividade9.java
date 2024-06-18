import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em graus fahrenheit: ");
		float fahrenheit = entrada.nextFloat();
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println("O valor da temperatura, em celsius, é: " + celsius);
		
		entrada.close();
	}

}