package factoryMethod2;

public class FactoryBibliotecario implements IFactoryVillager{
	public Villager criarVillager(String nome, String profissao) {
		return new Bibliotecario(nome, profissao);
	}
}
