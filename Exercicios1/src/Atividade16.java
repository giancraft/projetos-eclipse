import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da área, em metros quadrados, a ser pintada: ");
		float area = entrada.nextFloat();
		float litrosLatas = area / 108;
		double litrosGalao = area / 21.6;
		double quantidadeLatas = Math.ceil(litrosLatas);
		double quantidadeGalao = Math.ceil(litrosGalao);
		double precoLatas = quantidadeLatas * 80;
		double precoGalao = quantidadeGalao * 25;
		System.out.println("A quantidade de latas de tinta a serem compradas é: " 
		+ quantidadeLatas + " e o preço total a ser pago é: R$ " + precoLatas);
		System.out.println("A quantidade de galãos de tinta a serem compradas é: "
		+ quantidadeGalao + " e o preço total a ser pago é: R$ " + precoGalao);
		
		entrada.close();
	}

}