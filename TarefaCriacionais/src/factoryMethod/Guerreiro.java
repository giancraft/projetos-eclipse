package factoryMethod;

public class Guerreiro extends Personagem implements IPersonagem {
	public Guerreiro(String nome, String classe) {
		super(nome, classe);
	}
	
	public String info() {
		return "Ataques corpo-a-corpo";
	}
}
