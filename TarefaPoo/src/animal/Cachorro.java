package animal;

public class Cachorro extends Mamifero {

	private String raca;
	private String habitos;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getHabitos() {
		return habitos;
	}
	public void setHabitos(String habitos) {
		this.habitos = habitos;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [raça=");
		builder.append(raca);
		builder.append(", habitos=");
		builder.append(habitos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
