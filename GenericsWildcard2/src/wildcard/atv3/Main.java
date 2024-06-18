package wildcard.atv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(7);
		lista.add(18);
		
		System.out.println("A média dos números inseridos é: " + Calculadora.calculaMedia(lista));
		
		List<Double> lista2 = new ArrayList<>();
		lista2.add(4.897);
		lista2.add(7.5);
		lista2.add(8.9);
		lista2.add(10.0);
		
		System.out.println("A média dos números inseridos é: " + Calculadora.calculaMedia(lista2));
	}
}
