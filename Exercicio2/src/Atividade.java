import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a medida da altura da pirâmide: ");
		double altura = entrada.nextFloat();
		
		System.out.print("Insira a medida da área da base da pirâmide: ");
		double ab = entrada.nextDouble();
		
		int tipo = 0;
		while(tipo != 1 && tipo != 2 && tipo !=3) {
			System.out.print("Insira o tipo de tinta a ser utilizado: ");
			tipo = entrada.nextInt();
		}
		
		System.out.println("ab: " + ab);
		
		System.out.println("h: " + altura);
		
		double a1 = Math.sqrt(Math.pow(ab, 2) + Math.pow(altura, 2));
		System.out.println("a1: " + a1);
		
		double lado = ab * 2;
		double areaTri = (lado * a1) / 2;
		System.out.println("Área do triângulo: " + areaTri);
		
		double areaBase = Math.pow(lado, 2);
		System.out.println("Área da base: " + areaBase);
		
		double areaTotal = (4 * areaTri) + areaBase;
		System.out.println("Área total: " + areaTotal);
		
		System.out.println("Tipo de tinta: " + tipo);
		
		double litros = areaTotal / 4.76;
		System.out.println("Litros: " + litros);
		
		int latas = (int)Math.ceil(litros / 18);
		System.out.println("Latas: " + latas);
		
		double preco;
		if(tipo == 1) {
			preco = latas * 127.90;
		} else if(tipo == 2) {
			preco = latas * 258.98;
		} else {
			preco = latas * 344.34;
		}
		System.out.println("Preço: " + preco);
		
		double volume = (areaBase * altura) / 3;
		System.out.println("Volume: " + volume);

		
		entrada.close();
	}

}

