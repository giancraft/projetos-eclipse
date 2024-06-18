package com.classes.BO;

import com.classes.DTO.Cliente;
import java.util.List;

public class ClienteBO extends BO{
	
	public ClienteBO() {
		super();
	}

	public boolean inserir(Cliente cliente){
        if (existe(cliente) != true) {
            return permanencia.getClienteDAO().inserir(cliente);
        }
        return false;
    }
	
	public boolean existe(Cliente cliente){
        return permanencia.getClienteDAO().existe(cliente);
    }
	
	public boolean alterar(Cliente cliente) {
		return permanencia.getClienteDAO().alterar(cliente);
	}
	
	public boolean excluir(Cliente cliente) {
		return permanencia.getClienteDAO().excluir(cliente);
	}
	
	public Cliente procurarPorId(Cliente cliente) {
		return permanencia.getClienteDAO().procurarPorId(cliente);
	}
	
	public List<Cliente> pesquisarTodos(){
		return permanencia.getClienteDAO().pesquisarTodos();
	}
	
}
