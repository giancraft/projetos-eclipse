import java.util.Scanner;

public class Atividade10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira uma data: ");
		String dataCompleta = entrada.nextLine();
		
		int[] data = new int[3];
		
		for (int x = 0; x < 3; x++) {
			data[x] = dataCompleta.codePointAt(x);
		}
		
		for (int x = 0; x < 3; x++) {
			System.out.println(data[x]);
		}

		entrada.close();
	}
	
}
