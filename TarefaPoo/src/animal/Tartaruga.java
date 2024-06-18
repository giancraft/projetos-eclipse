package animal;

public class Tartaruga extends Reptil {
	
	private String tipoCasco;
	private String especieTartaruga;
	
	public String getTipoCasco() {
		return tipoCasco;
	}
	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	public String getEspecieTartaruga() {
		return especieTartaruga;
	}
	public void setEspecieTartaruga(String especieTartaruga) {
		this.especieTartaruga = especieTartaruga;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [tipoCasco=");
		builder.append(tipoCasco);
		builder.append(", especieTartaruga=");
		builder.append(especieTartaruga);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
