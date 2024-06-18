import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua altura: ");
		float altura = entrada.nextFloat();
		double peso = (72.7 * altura) - 58;
		System.out.println("Caso seja homem, seu peso ideal é: " + peso);
		
		entrada.close();
	}

}
