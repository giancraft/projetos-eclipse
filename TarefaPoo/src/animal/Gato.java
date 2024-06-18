package animal;

public class Gato extends Mamifero {
	
	private String raça;
	private float tamanhoGarras;
	private String habitos;
	
	public String getRaca() {
		return raça;
	}
	public void setRaca(String raça) {
		this.raça = raça;
	}
	public float getTamanhoGarras() {
		return tamanhoGarras;
	}
	public void setTamanhoGarras(float tamanhoGarras) {
		this.tamanhoGarras = tamanhoGarras;
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
		builder.append("Gato [raca=");
		builder.append(raça);
		builder.append(", tamanhoGarras=");
		builder.append(tamanhoGarras);
		builder.append(", habitos=");
		builder.append(habitos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
