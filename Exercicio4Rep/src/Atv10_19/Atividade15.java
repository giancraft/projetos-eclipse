package Atv10_19;

public class Atividade15 {
	
	public static void main(String[] args) {
		int num1 = 37;
		int num2 = 38;
		
		for (int x = 1; x <= 37; x++) {
			if (x == 1)
				System.out.print("S = " + num1 + "*" + num2 + "/" + x);
			else {
				num1--;
				num2--;
				System.out.print(" + " + num1 + "*" + num2 + "/" + x);
			}
		}
	}

}
