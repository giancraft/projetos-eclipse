package factoryMethod2;

public interface IVillager {
	public default String info() {
		return "Indefinido";
	}
}
