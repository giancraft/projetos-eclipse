package atividades_10_a_19;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o número de horas trabalhadas: ");
		int horas = entrada.nextInt();
		System.out.print("Insira a quantidade ganha por hora: ");
		float ganho = entrada.nextFloat();
		float salario = horas * ganho;
		double inss = salario * 0.1;
		double fgts = salario * 0.11;
		double impostoRenda = 0;
		double totalDescontos;
		double salarioLiquido;
		
		if (salario <= 900) {
			totalDescontos = inss + impostoRenda;
			salarioLiquido = salario - totalDescontos;
			System.out.println("Salário Bruto: " + salario);
			System.out.println("Imposto de Renda: isento");
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fgts);
			System.out.println("Total de Descontos: " + totalDescontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		} else if (salario > 900 && salario <= 1500) {
			impostoRenda = salario * 0.05;
			totalDescontos = inss + impostoRenda;
			salarioLiquido = salario - totalDescontos;
			System.out.println("Salário Bruto: " + salario);
			System.out.println("Imposto de Renda: " + impostoRenda);
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fgts);
			System.out.println("Total de Descontos: " + totalDescontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		} else if ( salario > 1500 && salario <= 2500) {
			impostoRenda = salario * 0.1;
			totalDescontos = inss + impostoRenda;
			salarioLiquido = salario - totalDescontos;
			System.out.println("Salário Bruto: " + salario);
			System.out.println("Imposto de Renda: " + impostoRenda);
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fgts);
			System.out.println("Total de Descontos: " + totalDescontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		} else {
			impostoRenda = salario * 0.2;
			totalDescontos = inss + impostoRenda;
			salarioLiquido = salario - totalDescontos;
			System.out.println("Salário Bruto: " + salario);
			System.out.println("Imposto de Renda: " + impostoRenda);
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fgts);
			System.out.println("Total de Descontos: " + totalDescontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		}
		
		entrada.close();
	}

}