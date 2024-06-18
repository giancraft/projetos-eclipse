package wildcard.atv3;

import java.util.List;

public class Calculadora {
	public static double calculaMedia(List<? extends Number> lista){
		double soma = 0;
		for(int i = 0; i < lista.size(); i++) {
			soma += lista.get(i).doubleValue();
		}
		double media = soma / (lista.size());
		return media;
	}
}
