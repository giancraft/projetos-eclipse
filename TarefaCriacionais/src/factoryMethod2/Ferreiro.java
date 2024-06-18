package factoryMethod2;

public class Ferreiro extends Villager implements IVillager{
	public Ferreiro(String nome, String profissao) {
		super(nome, profissao);
	}
	
	public String info() {
		return "Vende armas e ferramentas";
	}
}
