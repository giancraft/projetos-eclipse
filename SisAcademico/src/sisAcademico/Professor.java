package sisAcademico;

import java.time.LocalDate;

public class Professor {
	
	private String nome;
	private int matricula;
	private LocalDate dataNascimento;
	
	public Professor(String nome, int matricula, LocalDate dataNascimento) {
		setNome(nome);
		setMatricula(matricula);
		setDataNascimento(dataNascimento);
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [nome=");
		builder.append(nome);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}
	
	

}
