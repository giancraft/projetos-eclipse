package AbstractFactory;

public abstract class FastFoodPrototype {
	protected double preco;
	public abstract String exibirInfo();
	public abstract FastFoodPrototype clonar();
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
