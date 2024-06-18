package atv7;

public class Paciente {
	private String nomePaciente;
	private int nivelUrgencia; // de 0 a 10
	private Paciente prox;
	
	public Paciente(String nomePaciente, int nivelUrgencia) {
		this.prox = null;
		this.nomePaciente = nomePaciente;
		this.nivelUrgencia = nivelUrgencia;
	}

	public Paciente getProx() {
		return prox;
	}
	public void setProx(Paciente prox) {
		this.prox = prox;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public int getNivelUrgencia() {
		return nivelUrgencia;
	}
	public void setNivelUrgencia(int nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}

	@Override
	public String toString() {
		return "Paciente [nomePaciente=" + nomePaciente + ", nivelUrgencia=" + nivelUrgencia + ", prox=" + prox + "]";
	}
	
}
