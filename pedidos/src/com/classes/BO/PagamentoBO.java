package com.classes.BO;

import com.classes.DTO.Pagamento;
import com.classes.DTO.PedProd;
import com.classes.DTO.Pedido;

import java.util.List;

public class PagamentoBO extends BO{
	
	public PagamentoBO() {
		super();
	}
	
	public boolean inserir(Pagamento pagamento, PedProd pp){
        if (existe(pagamento) != true) {
            return permanencia.getPagamentoDAO().inserir(pagamento, pp);
        }
        return false;
    }
	
	public boolean existe(Pagamento pagamento){;
        return permanencia.getPagamentoDAO().existe(pagamento);
    }
	
	public boolean alterar(Pagamento pagamento, PedProd pp) {
		return permanencia.getPagamentoDAO().alterar(pagamento, pp);
	}
	
	public boolean excluir(Pagamento pagamento) {
		return permanencia.getPagamentoDAO().excluir(pagamento);
	}
	
	public Pagamento procurarPorId(Pagamento pagamento, PedProd pp) {
		return permanencia.getPagamentoDAO().procurarPorId(pagamento, pp);
	}
	
	public List<Pagamento> pesquisarTodos(Pedido pedido){
		return permanencia.getPagamentoDAO().pesquisarTodos(pedido);
	}

}
