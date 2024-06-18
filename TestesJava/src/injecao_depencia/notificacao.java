package injecao_depencia;

import java.util.Scanner;

public class notificacao {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Como você gostaria de receber suas notificacoes? 1 - email, 2 - SMS, 3 - Whatsapp: ");
		String resp = entrada.nextLine();
		
		
		
		entrada.close();
	}
}
