package factoryMethod;

public interface IPersonagem {
	public default String info() {
		return "Sem classe";
	}
}
