package factoryMethod2;

public class Main {
	public static void main(String[] args) {
		FactoryVillager factory = new FactoryVillager();
		Villager v1 = factory.criarVillager("Roberto", "Bibliotecario");
		Villager v2 = factory.criarVillager("Rodrigo", "ferreiro");
		Villager v3 = factory.criarVillager("Rogerio", "Fazendeiro");
		Villager v4 = factory.criarVillager("Ronaldo", "");
		
		System.out.println(v1.info());
		System.out.println(v2.info());
		System.out.println(v3.info());
		System.out.println(v4.info());
	}
}
