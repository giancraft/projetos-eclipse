package AbstractFactory;

public class WhopperPrototype extends FastFoodPrototype{
	protected WhopperPrototype(WhopperPrototype whopperPrototype) {
		this.preco = whopperPrototype.getPreco();
	}
	public WhopperPrototype() {
		preco = 0.0;
	}
	
	public String exibirInfo() {
		return "Nome: Whopper\nFranquia: Burguer King\nPreco: R$" + getPreco();
	}
	
	public FastFoodPrototype clonar() {
		return new WhopperPrototype(this);
	}
}
