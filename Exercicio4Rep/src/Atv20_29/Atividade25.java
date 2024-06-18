package Atv20_29;

public class Atividade25 {
	
	public static void main(String[] args) {
		float preco = (float) 1.99; 
		
		System.out.println("Lojas Quase Dois - Tabela de Preços");
		
		for (int x = 1; x <= 50; x++) {
			System.out.println(x + " - R$ " + preco * x); 	
		}
	}

}
