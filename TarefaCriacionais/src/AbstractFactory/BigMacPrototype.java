package AbstractFactory;

public class BigMacPrototype extends FastFoodPrototype {
	protected BigMacPrototype(BigMacPrototype bigMacPrototype) {
		this.preco = bigMacPrototype.getPreco();
	}
	public BigMacPrototype() {
		preco = 0.0;
	}
	
	public String exibirInfo() {
		return "Nome: Big Mac\nFranquia: McDonalds\nPreco: R$" + getPreco();
	}
	
	public FastFoodPrototype clonar() {
		return new BigMacPrototype(this);
	}
}
