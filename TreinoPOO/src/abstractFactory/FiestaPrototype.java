package abstractFactory;

public class FiestaPrototype extends CarroPrototype{
	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
		this.valorCompra = fiestaPrototype.getValorCompra();
	}
	public FiestaPrototype() {
		valorCompra = 0.0;
	}
	
	public String exibirInfo() {
		return "Modelo: Fiesta\nMontadora: Ford\nValor: R$" + getValorCompra();
	}
	
	public CarroPrototype clonar() {
		return new FiestaPrototype(this);
	}
}
