package factoryMethod;

public class FactoryArqueiro implements IFactoryPersonagem{
	public Personagem criarPersonagem(String nome, String classe) {
		return new Arqueiro(nome, classe);
	}
}
