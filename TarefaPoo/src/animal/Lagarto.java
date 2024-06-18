package animal;

public class Lagarto extends Reptil {
	
	private String especieLagarto;
	private float tamanhoCauda;
	
	public String getEspecieLagarto() {
		return especieLagarto;
	}
	public void setEspecieLagarto(String especieLagarto) {
		this.especieLagarto = especieLagarto;
	}
	public float getTamanhoCauda() {
		return tamanhoCauda;
	}
	public void setTamanhoCauda(float tamanhoCauda) {
		this.tamanhoCauda = tamanhoCauda;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [especieLagarto=");
		builder.append(especieLagarto);
		builder.append(", tamanhoCauda=");
		builder.append(tamanhoCauda);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
