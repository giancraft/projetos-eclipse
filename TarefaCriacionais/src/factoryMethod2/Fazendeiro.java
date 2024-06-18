package factoryMethod2;

public class Fazendeiro extends Villager implements IVillager{
	public Fazendeiro(String nome, String profissao) {
		super(nome, profissao);
	}
	
	public String info() {
		return "Vende sementes e colheita";
	}
}
