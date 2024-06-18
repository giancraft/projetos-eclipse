package sisAcademico;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private String cargaHoraria;
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professor;
	private ArrayList<Avaliacao> avaliacao;
	
	public Disciplina(String nome, String cargaHoraria, ArrayList<Aluno> alunos, ArrayList<Professor> professor, ArrayList<Avaliacao> avaliacao) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		setAlunos(alunos);
		setProfessor(professor);
		setAvaliacao(avaliacao);
	}
	
	public Disciplina(String nome, String cargaHoraria, ArrayList<Aluno> alunos, ArrayList<Professor> professor) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		setAlunos(alunos);
		setProfessor(professor);
	}
	
	public Disciplina(String nome, String cargaHoraria) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public ArrayList<Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(ArrayList<Professor> professor) {
		if (professor.size() > 0 && professor.size() <= 4)
			this.professor = professor;
	}
	public ArrayList<Avaliacao> getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(ArrayList<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", avaliacao=");
		builder.append(avaliacao);
		builder.append("]");
		return builder.toString();
	}
	
}
