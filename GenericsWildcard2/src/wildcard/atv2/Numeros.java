package wildcard.atv2;

import java.util.List;

public class Numeros {
	public static void adicionarNumeros(List<? super Number> lista, Number numero){
		lista.add(numero);
	}
}
