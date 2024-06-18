import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a sua segunda nota: ");
		float nota2 = entrada.nextFloat();
		float media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: " + media);		
		if (media >= 7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
		
		entrada.close();
	}

}