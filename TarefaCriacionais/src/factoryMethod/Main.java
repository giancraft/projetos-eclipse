package factoryMethod;

public class Main {

	public static void main(String[] args) {
		FactoryPersonagem factory = new FactoryPersonagem();
		Personagem p1 = factory.criarPersonagem("Igor", "Guerreiro");
		Personagem p2 = factory.criarPersonagem("Gian", "mago");
		Personagem p3 = factory.criarPersonagem("Pedro", "Arqueiro");
		Personagem p4 = factory.criarPersonagem("Daniel", "");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		System.out.println(p4.info());
	}
}
