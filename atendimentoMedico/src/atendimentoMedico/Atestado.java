package atendimentoMedico;

public class Atestado {
	
	private String descricao;
	
	public Atestado(String descricao) {
		setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}

}
