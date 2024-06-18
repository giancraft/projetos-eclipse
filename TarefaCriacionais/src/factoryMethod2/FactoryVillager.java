package factoryMethod2;

public class FactoryVillager implements IFactoryVillager{
	@Override
	public Villager criarVillager(String nome, String profissao) {
		if ("Bibliotecario".equalsIgnoreCase(profissao)) {
			FactoryBibliotecario fp = new FactoryBibliotecario();
			return fp.criarVillager(nome, profissao);
		} else if ("Ferreiro".equalsIgnoreCase(profissao)) {
			FactoryFerreiro fp = new FactoryFerreiro();
			return fp.criarVillager(nome, profissao);
		} else if ("Fazendeiro".equalsIgnoreCase(profissao)) {
			FactoryFazendeiro fp = new FactoryFazendeiro();
			return fp.criarVillager(nome, profissao);
		} else
			return new Villager(nome, profissao);
	}
	
}
