package AbstractFactory;

public class BurguerKing implements FabricaDeFastFood {
	public Hamburguer criarHamburguer() {
		return new Whopper();
	}
	public BatataFrita criarBatataFrita() {
		return new BatataGrande();
	}
}
