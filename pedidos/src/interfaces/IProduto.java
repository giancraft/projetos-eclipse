package interfaces;

import java.util.List;

import com.classes.DTO.Administrador;
import com.classes.DTO.Produto;

public interface IProduto {
	public boolean inserir(Produto produto, Administrador adm);
	public boolean alterar(Produto produto, Administrador adm);
	public boolean existe(Produto produto);
	public boolean excluir(Produto produto);
	public Produto procurarPorId(Produto produto, Administrador adm);
	public List<Produto> pesquisarTodos(Administrador adm);
}
