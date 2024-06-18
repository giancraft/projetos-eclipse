package Atv1_9;

public class Atividade6 {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 50; x++) {
			if (x % 2 != 0) {
				if (x != 49) 
					System.out.print(x + ", ");
				else
					System.out.print(x + ".");
			}
		}
		
	}
	
}
