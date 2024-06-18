package com.classes.BO;

import com.classes.DTO.Cliente;
import com.classes.DTO.Pedido;
import java.util.List;

public class PedidoBO extends BO{
	
	public PedidoBO() {
		super();
	}
	
	public boolean inserir(Pedido pedido, Cliente cliente){
        if (existe(pedido) != true) {
            return permanencia.getPedidoDAO().inserir(pedido, cliente);
        }
        return false;
    }
	
	public boolean existe(Pedido pedido){
        return permanencia.getPedidoDAO().existe(pedido);
    }
	
	public boolean excluir(Pedido pedido) {
		return permanencia.getPedidoDAO().excluir(pedido);
	}
	
	public Pedido procurarPorId(Pedido pedido, Cliente cliente) {
		return permanencia.getPedidoDAO().procurarPorId(pedido, cliente);
	}
	
	public List<Pedido> pesquisarTodos(Cliente cliente){
		return permanencia.getPedidoDAO().pesquisarTodos(cliente);
	}

}
