package atendimentoMedico;

import java.util.ArrayList;

public class Medico extends Pessoa{

	private ArrayList<Especialidade> especialidade;
	
	public Medico(String nome, String dataNascimento) {
		super(nome, dataNascimento);
	}
	
	public Medico(String nome, String dataNascimento, ArrayList<Especialidade> especialidade) {
		super(nome, dataNascimento);
		setEspecialidade(especialidade);
	}

	public ArrayList<Especialidade> getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(ArrayList<Especialidade> especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialidade=");
		builder.append(especialidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
