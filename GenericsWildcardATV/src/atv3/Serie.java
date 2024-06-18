package atv3;

public class Serie extends ProdutoX {
	private int numEps; //número de episódios
	
	public Serie(String nome, String genero, String diretor, String atorPrincipal, int numEps) {
		super(nome, genero, diretor, atorPrincipal);
		setNumEps(numEps);
	}

	public int getNumEps() {
		return numEps;
	}
	public void setNumEps(int numEps) {
		this.numEps = numEps;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [numEps=");
		builder.append(numEps);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
