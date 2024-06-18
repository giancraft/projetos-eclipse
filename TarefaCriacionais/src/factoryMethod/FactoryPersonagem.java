package factoryMethod;

public class FactoryPersonagem implements IFactoryPersonagem{
	public Personagem criarPersonagem(String nome, String classe) {
		if ("Guerreiro".equalsIgnoreCase(classe)) {
			FactoryGuerreiro fp = new FactoryGuerreiro();
			return fp.criarPersonagem(nome, classe);
		} else if ("Mago".equalsIgnoreCase(classe)) {
			FactoryMago fp = new FactoryMago();
			return fp.criarPersonagem(nome, classe);
		} else if ("Arqueiro".equals(classe)) {
			FactoryArqueiro fp = new FactoryArqueiro();
			return fp.criarPersonagem(nome, classe);
		} else
			return new Personagem(nome, classe);
	}
}
