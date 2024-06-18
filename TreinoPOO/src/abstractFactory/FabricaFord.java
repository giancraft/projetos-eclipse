package abstractFactory;

public class FabricaFord implements FabricaDeCarro {
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}
	
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}
}
