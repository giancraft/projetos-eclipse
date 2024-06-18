import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a sua primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a sua segunda nota: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Insira a sua terceira nota: ");
		float nota3 = entrada.nextFloat();
		System.out.print("Insira a sua quarta nota: ");
		float nota4 = entrada.nextFloat();
		
		System.out.print("Qual a sua frequência?: ");
		float frequencia = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Sua média foi: " + media);
		
		if (frequencia >= 75) {
			if (media >= 6 ) 
				System.out.println("Parabéns, você foi aprovado!");
			else 
				System.out.println("Infelizmente você reprovou.");
			
		} else {
			System.out.println("Infelizmente você reprovou por frequência.");
		}
		
		entrada.close();
	}

}