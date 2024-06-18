import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade ganha por hora mensal: ");
		float quantidade = entrada.nextFloat();
		System.out.print("Insira o número de horas trabalhadas mensal: ");
		float horas = entrada.nextFloat();
		float salario = quantidade * horas;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		double impostoRenda = salario * 0.11;
		double salarioLiquido = salario - (inss + sindicato + impostoRenda);
		System.out.println("Seu salário bruto é: R$ " + salario);
		System.out.println("O valor pago ao INSS foi: " + inss);
		System.out.println("O valor pago ao sindicato foi: " + sindicato);
		System.out.println("O valor pago ao imposto de renda foi: " + impostoRenda);
		System.out.println("Seu salário líquido é: R$ " + salarioLiquido);
		
		entrada.close();
	}

}