package sisAcademico;

import java.time.LocalDate;

public class Avaliacao {
	
	private String conteudo;
	private String descricao;
	private LocalDate data;
	private Professor professor;
	
	public Avaliacao(String conteudo, String descricao, LocalDate data, Professor professor) {
		setConteudo(conteudo);
		setDescricao(descricao);
		setData(data);
		setProfessor(professor);
	}
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao [conteudo=");
		builder.append(conteudo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", data=");
		builder.append(data);
		builder.append(", professor=");
		builder.append(professor);
		builder.append("]");
		return builder.toString();
	}
	
}
