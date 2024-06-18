package exemplosSingleton;

//Exemplo: Uso de uma instância para evitar problemas de impressão simultânea

public class ControleImpressao {
	
	private static ControleImpressao con;
	
	private String documento;
	private String paginas;
	private int impressoes;
	
	private ControleImpressao() {
		
	}
	
	public static ControleImpressao getCon() {
		return con;
	}
	public static void setCon(ControleImpressao con) {
		ControleImpressao.con = con;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getPaginas() {
		return paginas;
	}
	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	public int getImpressoes() {
		return impressoes;
	}
	public void setImpressoes(int impressoes) {
		this.impressoes = impressoes;
	}	
	
	public static ControleImpressao getInstance() {
		if (con == null)
			con = new ControleImpressao();
		return con;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ControleImpressao [documento=");
		builder.append(documento);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", impressoes=");
		builder.append(impressoes);
		builder.append("]");
		return builder.toString();
	}
}
