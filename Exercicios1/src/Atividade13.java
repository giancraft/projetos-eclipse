import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o peso de seus peixes: ");
		float peso = entrada.nextFloat();
		if (peso > 50) {
			float excesso = peso - 50;
			float multa = excesso * 4;
			System.out.println("O peso em excesso foi: " + excesso + " e a multa foi: "
					+ multa);
		} else {
			float excesso = 0;
			float multa = 0;
			System.out.println("O peso em excesso foi: " + excesso + " e a multa foi: "
					+ multa);
		}
		
		entrada.close();
	}

}
