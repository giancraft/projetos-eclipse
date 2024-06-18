package Atv1_9;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		for (int x = 1; x <= 20; x++) {
			System.out.println(x);
		}
		
		System.out.println("xxxxxxxxxxxxxxxxxxx");
		
		for (int x = 1; x <= 20; x++) {
			if (x == 20)
				System.out.print(x + ".");
			else
				System.out.print(x + ", ");
		}
		
		entrada.close();
	}
	
}
