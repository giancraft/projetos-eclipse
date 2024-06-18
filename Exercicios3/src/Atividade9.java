import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o seu sexo (M - Masculino / F - Feminino): ");
		String sexo = entrada.nextLine();
		while (!(sexo.equals("F")) && !(sexo.equals("M"))) {
			System.out.print("Sexo inválido. Insira novamente: ");
			sexo = entrada.nextLine();
		}
		
		System.out.print("Insira sua altura: ");
		float altura = entrada.nextFloat();
		
		System.out.print("Insira seu peso: ");
		float peso = entrada.nextFloat();
		double pesoIdeal = 0;
		
		if (sexo.equals("F")) {
			pesoIdeal = (62.1 * altura) - 44.7;
			if (peso < pesoIdeal)
				System.out.println("Você está abaixo do peso ideal.");
			else if (peso > pesoIdeal)
				System.out.println("Você está acima do peso ideal.");
			else
				System.out.println("Você está dentro do peso ideal.");
		} else {
			pesoIdeal = (72.7 * altura) - 58;
			if (peso < pesoIdeal)
				System.out.println("Você está abaixo do peso ideal.");
			else if (peso > pesoIdeal)
				System.out.println("Você está acima do peso ideal.");
			else
				System.out.println("Você está dentro do peso ideal.");
		}
		
		entrada.close();
	}

}