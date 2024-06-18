import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade ganha por hora mensal: ");
		float quantidade = entrada.nextFloat();
		System.out.print("Insira o número de horas trabalhadas mensal: ");
		float horas = entrada.nextFloat();
		float salario = quantidade * horas;
		System.out.println("Salário: R$" + salario);
		
		entrada.close();
	}

}