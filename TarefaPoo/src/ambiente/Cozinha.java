package ambiente;

public class Cozinha extends Ambiente {

	private boolean microondas;

	public boolean isMicroondas() {
		return microondas;
	}
	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cozinha [microondas=");
		builder.append(microondas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
