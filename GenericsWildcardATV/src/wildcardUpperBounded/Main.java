package wildcardUpperBounded;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(8);
		lista1.add(10);
		lista1.add(3);
		System.out.println("Total da multiplicacao 1: " + Multiplicacao.mult(lista1));
		
		List<Double> lista2 = new ArrayList<>();
		lista2.add(7.0);
		lista2.add(8.5);
		
		System.out.println("Total da multiplicacao 2: " + Multiplicacao.mult(lista2));
	}
}
