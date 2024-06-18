package interfaces;

import java.util.List;
import com.classes.DTO.Administrador;

public interface IAdministrador {
	public boolean inserir(Administrador adm);
	public boolean alterar(Administrador adm);
	public boolean existe(Administrador adm);
	public boolean excluir(Administrador adm);
	public Administrador procurarPorId(Administrador adm);
	public List<Administrador> pesquisarTodos();
}
