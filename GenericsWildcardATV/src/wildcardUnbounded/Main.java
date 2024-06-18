package wildcardUnbounded;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(10);
		lista1.add(18);
		System.out.println(MostraQualquer.mostra(lista1));
		
		List<Double> lista2 = new ArrayList<>();
		lista2.add(8.4);
		lista2.add(19.356);
		System.out.println(MostraQualquer.mostra(lista2));
	}

}
