package com.classes.BO;

import com.classes.DTO.Administrador;
import java.util.List;

public class AdministradorBO extends BO{
	
	public AdministradorBO(){
		super();
	}
	
	public boolean inserir(Administrador administrador){
        if (existe(administrador) != true) {
            return permanencia.getAdministradorDAO().inserir(administrador);
        }
        return false;
    }
	
	public boolean existe(Administrador administrador){
        return permanencia.getAdministradorDAO().existe(administrador);
    }
	
	public boolean alterar(Administrador administrador) {
		return permanencia.getAdministradorDAO().alterar(administrador);
	}
	
	public boolean excluir(Administrador administrador) {
		return permanencia.getAdministradorDAO().excluir(administrador);
	}
	
	public Administrador procurarPorId(Administrador adm) {
		return permanencia.getAdministradorDAO().procurarPorId(adm);
	}
	
	public List<Administrador> pesquisarTodos(){
		return permanencia.getAdministradorDAO().pesquisarTodos();
	}

}
