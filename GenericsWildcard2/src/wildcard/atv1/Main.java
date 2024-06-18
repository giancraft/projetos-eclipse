package wildcard.atv1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> planetas = new ArrayList<>();
		planetas.add("Tatooine");
		planetas.add("Dagobah");
		planetas.add("Caladan");
		planetas.add("Arda");
		
		System.out.println(Imprimir.imprimirLista(planetas));

	}

}
