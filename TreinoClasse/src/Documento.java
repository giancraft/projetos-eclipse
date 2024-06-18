
public class Documento {
	
	private String texto;
	
	public Documento() {
		
	}
	
	public Documento(String texto) {
		setTexto(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String documento) {
		this.texto = documento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}

}
