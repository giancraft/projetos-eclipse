package atv1;

public class Livro {
	private String autor;
	private String titulo;
	private String genero;
	private int numPaginas;	
	
	public Livro(String autor, String titulo, String genero, int numPaginas) {
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", numPaginas=");
		builder.append(numPaginas);
		builder.append("]");
		return builder.toString();
	}
	
}
