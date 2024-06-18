package factoryMethod;

public class FactoryMago implements IFactoryPersonagem{
	public Personagem criarPersonagem(String nome, String classe) {
		return new Mago(nome, classe);
	}
}
