
public class Bola {
	
	private float tamanho = 100;
	private String tipo = "Futebol";
	
	public Bola(float tamanho) {
		setTamanho(tamanho);
	}
	
	public Bola(String tipo) {
		setTipo(tipo);
	}
	
	public Bola(float tamanho, String tipo) {
		setTamanho(tamanho);
		setTipo(tipo);
	}
	
	public Bola() {
		
	}
	
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		if(tamanho > 0)
			this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if (tipo.length() > 0)
			this.tipo = tipo;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bola [tamanho=");
		builder.append(tamanho);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}