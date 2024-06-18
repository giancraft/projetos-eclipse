package sisAcademico;

import java.time.LocalDate;
import java.util.Arrays;

public class Frequencia {
	
	private int[] presenca;
	private LocalDate data;
	private Professor professor;
	private Disciplina disciplina;
	
	public Frequencia(int[] presenca, LocalDate data, Professor professor, Disciplina disciplina) {
		setPresenca(presenca, disciplina);
		setData(data);
		setProfessor(professor);
		setDisciplina(disciplina);
	}
	
	public int[] getPresenca() {
		return presenca;
	}
	public void setPresenca(int[] presenca, Disciplina disciplina) {
		if (presenca.length == disciplina.getAlunos().size())
			this.presenca = presenca;
		else
			System.out.println("Erro: Número de frequências diferente do número de alunos.");
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [presenca=");
		builder.append(Arrays.toString(presenca));
		builder.append(", data=");
		builder.append(data);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}
	
}
