package atendimentoMedico;

import java.util.ArrayList;

public class ListaAtendimento {
	
	private ArrayList<Paciente> pacientes;
	
	public ListaAtendimento(ArrayList<Paciente> pacientes) {
		setPacientes(pacientes);
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public void ordenaLista() {
		int tam = pacientes.size();
		for (int j = 0; j < tam-1; j++) {
			int min_index = j;
			for (int i = j; i < tam; i++) {
				if (pacientes.get(i).getPrioridade() > pacientes.get(min_index).getPrioridade()) {
					min_index = i;
				}
			}
			if (pacientes.get(j).getPrioridade() < pacientes.get(min_index).getPrioridade()) {
				Paciente aux = pacientes.get(j);
				pacientes.set(j, pacientes.get(min_index));
				pacientes.set(min_index, aux);
			}
		} 
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento [pacientes=");
		builder.append(pacientes);
		builder.append("]");
		return builder.toString();
	}

}
