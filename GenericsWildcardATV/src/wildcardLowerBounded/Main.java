package wildcardLowerBounded;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(4);
		lista1.add(5);
		System.out.println(MostraIntegerOuSuper.mostra(lista1));
		
		List<Number> lista2 = new ArrayList<>();
		lista2.add(2.3);
		lista2.add(5.7);
		System.out.println(MostraIntegerOuSuper.mostra(lista2));
	}

}
