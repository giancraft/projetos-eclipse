package generics.atv1;

public class Movel extends Item {
	
	public Movel(String nome, String cor) {
		super(nome, cor);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movel [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
