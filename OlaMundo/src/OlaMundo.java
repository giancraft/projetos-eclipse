import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro: ");
		int num = entrada.nextInt();
		System.out.println("num: " + num);
		
		System.out.print("Informe um valor real: ");
		float numF = entrada.nextFloat();
		System.out.println("numF: " + numF);
		
		System.out.print("Informe um valor real: ");
		double numD = entrada.nextDouble();
		System.out.println("numD: " + numD);
		
		entrada.nextLine();
		
		System.out.print("Informe um texto: ");
		String texto = entrada.nextLine();
		System.out.println("texto: " + texto);
		
		System.out.print("Informe uma letra: ");
		char letra = entrada.nextLine().charAt(0);
		System.out.println("letra: " + letra);
		
		entrada.close();
	}

}
