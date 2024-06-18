package wildcardUpperBounded;

import java.util.List;

public class Multiplicacao {
	
	public static double mult(List<? extends Number> lista) {
		double mult = 1;
		for (Number i : lista) {
			mult *= i.doubleValue();
		}
		return mult;
	}
}
