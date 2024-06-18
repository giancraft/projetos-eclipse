package factoryMethod2;

public class FactoryFerreiro implements IFactoryVillager{
	public Villager criarVillager(String nome, String profissao) {
		return new Ferreiro(nome, profissao);
	}
}
