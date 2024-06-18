package Atv30_37;

import java.util.Scanner;

public class Atividade34 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		int interv1 = 0;
		int interv2 = 0;
		int interv3 = 0;
		int interv4 = 0;
		
		while (num >= 0) {
			System.out.print("Insira um número: ");
			num = entrada.nextInt();
			
			if (num >= 0 && num <=25)
				interv1++;
			else if (num >= 26 && num <= 50)
				interv2++;
			else if (num >=51 && num <= 75)
				interv3++;
			else if (num >=76 && num <= 100)
				interv4++;
		}
		
		System.out.println("Números entre 0-25: " + interv1);
		System.out.println("Números entre 26-50: " + interv2);
		System.out.println("Números entre 51-75: " + interv3);
		System.out.println("Números entre 76-100: " + interv4);
		
		entrada.close();
	}

}
