package atv2;

import java.util.List;
import java.util.ArrayList;

public class ListaProdutos {
	private Produto inicio;
	private Produto fim;
	private int desconto;
	
	public ListaProdutos() {
		inicio = null;
	}
	
	public Produto getInicio() {
		return inicio;
	}
	
	public void inserirDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public int getDesconto() {
		return desconto;
	}
	
	public void inserirInicio(int codigo, float preco, int quantidade) {
		Produto novoProduto = new Produto(codigo, preco, quantidade);
		if (inicio == null) {// caso lista esteja vazia
			inicio = novoProduto;
			inicio.setProx(inicio);
			fim = inicio;
		}  else {// caso lista não esteja vazia
			novoProduto.setProx(inicio);
			inicio = novoProduto;
			fim.setProx(inicio);
		}
	}
	
	public String mostrarLista() {
		String lista = "";
		if (inicio == null) return lista;
		Produto aux = inicio;
		do {
			lista += "Código: " + aux.getCodigo() + "\n";
			lista += "Preço: " + aux.getPreco() + "\n";
			lista += "Quantidade: " + aux.getQuantidade() + "\n";
			aux = aux.getProx();
		} while(aux != inicio);
		return lista;
	}
	
	public void aplicarDesconto() {
		if (inicio == null) {
			System.out.println("A lista está vazia");
			return;
		}
		Produto aux = inicio;
		List<Integer> quantMaior = new ArrayList<>();
		System.out.println("Relatório \n");
		do {
			aux.setPreco(aux.getPreco() - (aux.getPreco() * desconto / 100));
			System.out.println("Código: " + aux.getCodigo());
			System.out.println("Preço com Desconto: " + aux.getPreco() + "\n");
			if (aux.getQuantidade() > 100)
				quantMaior.add(aux.getQuantidade());
			aux = aux.getProx();
		} while (aux.getProx() != inicio.getProx());
		System.out.println("Quantidade de produtos com estoque maior que 100: " + quantMaior);
	}
	
}
