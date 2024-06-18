package animal;

public class Reptil extends Animal {

	private String estruturaCorporal; //como carapaça, plastrão, escamas, etc.
	private String especie;
	
	public String getEstruturaCorporal() {
		return estruturaCorporal;
	}
	public void setEstruturaCorporal(String estruturaCorporal) {
		this.estruturaCorporal = estruturaCorporal;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public boolean trocaPele() {
		return true;
	} 
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [estruturaCorporal=");
		builder.append(estruturaCorporal);
		builder.append(", especie=");
		builder.append(especie);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
