package factoryMethod;

public class FactoryGuerreiro implements IFactoryPersonagem{
	public Personagem criarPersonagem(String nome, String classe) {
		return new Guerreiro(nome, classe);
	}
}
