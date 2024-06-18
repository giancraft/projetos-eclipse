package sisAcademico;

import java.util.ArrayList;

public class Fase {
	
	private int numero;
	private String cargaHoraria;
	private Curso curso;
	private ArrayList<Disciplina> disciplinas;
	
	public Fase(int numero, String cargaHoraria, Curso curso, ArrayList<Disciplina> disciplinas) {
		setNumero(numero);
		setCargaHoraria(cargaHoraria);
		setCurso(curso);
		setDisciplinas(disciplinas);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [numero=");
		builder.append(numero);
		builder.append(", cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", disciplinas=");
		builder.append(disciplinas);
		builder.append("]");
		return builder.toString();
	}

}
