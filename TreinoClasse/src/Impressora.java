
public class Impressora {
	
	private Documento documento;

	public Impressora (Documento documento) {
		setDocumento(documento);
	}
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	public String imprimir() {
		return documento.getTexto();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Impressora [documento=");
		builder.append(documento.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
