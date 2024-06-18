package factoryMethod;

public class Arqueiro extends Personagem implements IPersonagem{
	public Arqueiro(String nome, String classe) {
		super(nome, classe);
	}
	
	public String info() {
		return "Atira com arco e flecha";
	}
}
