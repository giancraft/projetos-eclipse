package factoryMethod2;

public class FactoryFazendeiro implements IFactoryVillager{
	public Villager criarVillager(String nome, String profissao) {
		return new Fazendeiro(nome, profissao);
	}
}
