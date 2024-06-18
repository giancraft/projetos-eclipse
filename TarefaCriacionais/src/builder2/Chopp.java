package builder2;

public class Chopp {
	private String marca;
	private boolean pilsen;
	private boolean ipa;
	private boolean vinho;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isPilsen() {
		return pilsen;
	}
	public void setPilsen(boolean pilsen) {
		this.pilsen = pilsen;
	}
	public boolean isIpa() {
		return ipa;
	}
	public void setIpa(boolean ipa) {
		this.ipa = ipa;
	}
	public boolean isVinho() {
		return vinho;
	}
	public void setVinho(boolean vinho) {
		this.vinho = vinho;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Chopp [marca=");
		builder.append(marca);
		builder.append(", pilsen=");
		builder.append(pilsen);
		builder.append(", ipa=");
		builder.append(ipa);
		builder.append(", vinho=");
		builder.append(vinho);
		builder.append("]");
		return builder.toString();
	}
}
