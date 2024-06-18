package generics.atv1;

public class Eletrodomestico extends Item{
	private double consumoEnergia;

	public Eletrodomestico(String nome, String cor, double consumoEnergia) {
		super(nome, cor);
		setConsumoEnergia(consumoEnergia);
	}
	
	public double getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(double consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eletrodomestico [consumoEnergia=");
		builder.append(consumoEnergia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
