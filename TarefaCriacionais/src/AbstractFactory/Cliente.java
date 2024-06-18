package AbstractFactory;

public class Cliente {
	public static void main(String[] args) {
		FabricaDeFastFood fabrica = new BurguerKing();
		Hamburguer hamburguer = fabrica.criarHamburguer();
		BatataFrita batata = fabrica.criarBatataFrita();
		hamburguer.exibirInfoBurguer();
		System.out.println();
		batata.exibirInfoBatata();
		System.out.println();
		
		fabrica = new McDonalds();
		hamburguer = fabrica.criarHamburguer();
		batata = fabrica.criarBatataFrita();
		hamburguer.exibirInfoBurguer();
		System.out.println();
		batata.exibirInfoBatata();
		System.out.println();
		
		WhopperPrototype whopperpro = new WhopperPrototype();
		FastFoodPrototype whopperNovo = whopperpro.clonar();
		whopperNovo.setPreco(25.99);
		FastFoodPrototype whopperPromo = whopperpro.clonar();
		whopperPromo.setPreco(12.00);
		BigMacPrototype bigpro = new BigMacPrototype();
		FastFoodPrototype bigNovo = bigpro.clonar();
		bigNovo.setPreco(23.99);
		FastFoodPrototype bigPromo = bigpro.clonar();
		bigPromo.setPreco(11.00);
		System.out.println(whopperNovo.exibirInfo());
		System.out.println(whopperPromo.exibirInfo());
		System.out.println(bigNovo.exibirInfo());
		System.out.println(bigPromo.exibirInfo());
	}
}
