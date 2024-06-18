package abstractFactory;

public class Main {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criarCarroSedan();
		CarroPopular popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
		System.out.println();
		
		fabrica = new FabricaFord();
		sedan = fabrica.criarCarroSedan();
		popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
	}

}
