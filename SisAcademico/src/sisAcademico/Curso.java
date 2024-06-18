package sisAcademico;

public class Curso {
	
	private String nome;
	private String turno;
	private String modalidade;
	private String cargaHoraria;
	
	public Curso(String nome, String turno, String modalidade, String cargaHoraria) {
		setNome(nome);
		setTurno(turno);
		setModalidade(modalidade);
		setCargaHoraria(cargaHoraria);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", turno=");
		builder.append(turno);
		builder.append(", modalidade=");
		builder.append(modalidade);
		builder.append(", cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append("]");
		return builder.toString();
	}

}
