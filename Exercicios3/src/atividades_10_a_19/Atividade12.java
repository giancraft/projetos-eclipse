package atividades_10_a_19;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o seu salário: ");
		float salario = entrada.nextFloat();
		System.out.println("Seu salário é: " + salario);
		double aumento;
		double salarioNovo;
		
		if (salario <= 280) {
			aumento = salario * 0.2;
			salarioNovo = salario + aumento;
			System.out.println("O seu percentual de aumento é 20%");
			System.out.println("O valor de aumento é " + aumento);
			System.out.println("O seu novo salário é " + salarioNovo);
		} else if (salario > 280 && salario < 700) {
			aumento = salario * 0.15;
			salarioNovo = salario + aumento;
			System.out.println("O seu percentual de aumento é 15%");
			System.out.println("O valor de aumento é " + aumento);
			System.out.println("O seu novo salário é " + salarioNovo);
		} else if (salario >= 700 && salario < 1500) {
			aumento = salario * 0.1;
			salarioNovo = salario + aumento;
			System.out.println("O seu percentual de aumento é 10%");
			System.out.println("O valor de aumento é " + aumento);
			System.out.println("O seu novo salário é " + salarioNovo);
		} else {
			aumento = salario * 0.05;
			salarioNovo = salario + aumento;
			System.out.println("O seu percentual de aumento é 5%");
			System.out.println("O valor de aumento é " + aumento);
			System.out.println("O seu novo salário é " + salarioNovo);
		}
			
		entrada.close();
	}

}
