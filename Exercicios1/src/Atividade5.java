import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número em metros: ");
		float num = entrada.nextFloat();
		float conversao = num * 100;
		System.out.println("O número informado em centímetros equivale a: " + conversao);
		
		entrada.close();
	}

}