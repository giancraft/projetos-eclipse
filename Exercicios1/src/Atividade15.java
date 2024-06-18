import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da área, em metros quadrados, a ser pintada: ");
		float area = entrada.nextFloat();
		float litros = area / 54;
		double quantidade = Math.ceil(litros);
		double preco = quantidade * 80;
		System.out.println("A quantidade de latas de tinta a serem compradas é: " 
		+ quantidade + " e o preço total a ser pago é: R$ " + preco);
		
		entrada.close();
	}

}
