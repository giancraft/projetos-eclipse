package abstractFactory;

public class FabricaFiat implements FabricaDeCarro{

	public CarroSedan criarCarroSedan() {
		return new Siena();
	}
	
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}
	
}
