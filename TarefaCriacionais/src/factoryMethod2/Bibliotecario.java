package factoryMethod2;

public class Bibliotecario extends Villager implements IVillager{
	public Bibliotecario(String nome, String profissao) {
		super(nome, profissao);
	}
	
	public String info() {
		return "Vende livros";
	}
}
