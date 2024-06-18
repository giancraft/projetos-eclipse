package atendimentoMedico;

public class Especialidade {
	
	private String nomeEspecialidade;
	
	public Especialidade(String nome) {
		setNomeEspecialidade(nome);
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [nomeEspecialidade=");
		builder.append(nomeEspecialidade);
		builder.append("]");
		return builder.toString();
	}

}
