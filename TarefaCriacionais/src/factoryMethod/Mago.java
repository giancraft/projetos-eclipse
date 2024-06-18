package factoryMethod;

public class Mago extends Personagem implements IPersonagem{
	public Mago(String nome, String classe) {
		super(nome, classe);
	}
	
	public String info() {
		return "Dispara magias";
	}
	
	
}
