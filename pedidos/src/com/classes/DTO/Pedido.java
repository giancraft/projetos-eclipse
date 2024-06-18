package com.classes.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Id{
	
	private LocalDate data;
	private ArrayList<Produto> produtos;
	private Cliente cliente;
	
	public Pedido(LocalDate data, List<Produto> escolha, Cliente cliente) {
		setData(data);
		setProdutos(escolha);
		setCliente(cliente);
	}
	
	public Pedido() {
		
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> escolha) {
		this.produtos = (ArrayList<Produto>) escolha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionarItem(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerItem(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produto == produtos.get(i)) {
				produtos.remove(i);
				i = produtos.size();
			}
		}
	}
	
	public void excluirPedido(Pedido pedido) {
		pedido = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [data=");
		builder.append(data);
		builder.append(", produtos=");
		builder.append(produtos);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}
	

}
