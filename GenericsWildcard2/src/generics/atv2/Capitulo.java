package generics.atv2;

public class Capitulo<T> {
	
	private int numero;
	private T conteudo;

	public Capitulo(int numero, T conteudo) {
		setNumero(numero);
		setConteudo(conteudo);
	}
	
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Capitulo [numero=");
		builder.append(numero);
		builder.append(", conteudo=");
		builder.append(conteudo);
		builder.append("]");
		return builder.toString();
	}
	
}
