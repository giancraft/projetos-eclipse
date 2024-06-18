package com.classes.BO;

import com.classes.DTO.Administrador;
import com.classes.DTO.Produto;
import java.util.List;

public class ProdutoBO extends BO{
	
	public ProdutoBO(){
		super();
	}
	
	public boolean inserir(Produto produto, Administrador adm){
        if (existe(produto) != true) {
            return permanencia.getProdutoDAO().inserir(produto, adm);
        }
        return false;
    }
	
	public boolean existe(Produto produto){
        return permanencia.getProdutoDAO().existe(produto);
    }
	
	public boolean alterar(Produto produto, Administrador adm) {
		return permanencia.getProdutoDAO().alterar(produto, adm);
	}
	
	public boolean excluir(Produto produto) {
		return permanencia.getProdutoDAO().excluir(produto);
	}
	
	public Produto procurarPorId(Produto produto, Administrador adm) {
		return permanencia.getProdutoDAO().procurarPorId(produto, adm);
	}
	
	public List<Produto> pesquisarTodos(Administrador adm){
		return permanencia.getProdutoDAO().pesquisarTodos(adm);
	}

}
