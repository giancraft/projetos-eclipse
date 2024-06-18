import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int num3 = entrada.nextInt();
		if (num1 > num2 && num1 > num3)
			if (num2 > num3)
				System.out.println("Ordem decrescente dos número: " + num1 + num2 + num3);
			else
				System.out.println("Ordem decrescente dos número: " + num1 + num3 + num2);
		else if (num2 > num1 && num2 > num3)
			if (num1 > num3)
				System.out.println("Ordem decrescente dos número: " + num2 + num1 + num3);
			else
				System.out.println("Ordem decrescente dos número: " + num2 + num3 + num1);
		else if (num3 > num1 && num3 > num2)
			if (num1 > num2)
				System.out.println("Ordem decrescente dos número: " + num3 + num1 + num2);
			else
				System.out.println("Ordem decrescente dos número: " + num3 + num2 + num1);
		
		entrada.close();
	}

}