package com.classes.BO;

import com.classes.DTO.PedProd;
import com.classes.DTO.Pedido;
import com.classes.DTO.Produto;

import java.util.List;

public class PedProdBO extends BO{
	
	public PedProdBO() {
		super();
	}
	
	public boolean inserir(Pedido pedido, Produto produto, PedProd pp){
		if (existe(pp) != true)
			return permanencia.getPedProdDAO().inserir(pedido, produto, pp);
		return false;
    }
	
	public boolean existe(PedProd pp) {
		return permanencia.getPedProdDAO().existe(pp);
	}
	
	public boolean excluir(PedProd pp) {;
		return permanencia.getPedProdDAO().excluir(pp);
	}
	
	public PedProd procurarPorId(Pedido pedido, PedProd pp, Produto produto) {
		return permanencia.getPedProdDAO().procurarPorId(pedido, pp, produto);
	}
	
	public List<PedProd> pesquisarTodos(Pedido pedido){
		return permanencia.getPedProdDAO().pesquisarTodos(pedido);
	}
	

}
