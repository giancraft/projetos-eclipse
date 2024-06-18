package atv4;

public class Main {

	public static void main(String[] args) {
		Conjunto conj1 = new Conjunto();
		Conjunto conj2 = new Conjunto();
		
		conj1.inserirInicio(5);
		conj1.inserirInicio(3);
		conj1.inserirInicio(4);
		conj1.inserirInicio(2);
		
		conj2.inserirInicio(3);
		conj2.inserirInicio(4);
		conj2.inserirInicio(8);
		
		conj1.uniao(conj1, conj2);
		conj1.interseccao(conj1, conj2);
		conj1.diferenca(conj1, conj2);

	}

}
