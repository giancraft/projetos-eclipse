package atv2;

public class Produto {
	private int codigo;
	private float preco;
	private int quantidade;
	private Produto prox;
	
	public Produto(int codigo, float preco, int quantidade) {
		setCodigo(codigo);
		setPreco(preco);
		setQuantidade(quantidade);
		setProx(null);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProx() {
		return prox;
	}
	public void setProx(Produto prox) {
		this.prox = prox;
	}	
}
