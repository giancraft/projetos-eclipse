package AbstractFactory;

public class McDonalds implements FabricaDeFastFood{
	public Hamburguer criarHamburguer() {
		return new BigMac();
	}
	public BatataFrita criarBatataFrita() {
		return new BatataFina();
	}
}
