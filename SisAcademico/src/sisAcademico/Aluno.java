package sisAcademico;

import java.time.LocalDate;

public class Aluno {
	
	private String nome;
	private int matricula;
	private LocalDate dataNascimento;
	private Curso curso;
	
	public Aluno(String nome, int matricula, LocalDate dataNascimento, Curso curso) {
		setNome(nome);
		setMatricula(matricula);
		setDataNascimento(dataNascimento);
		setCurso(curso);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=");
		builder.append(nome);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", curso=");
		builder.append(curso);
		builder.append("]");
		return builder.toString();
	}

}
