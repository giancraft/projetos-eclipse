package interfaces;

import java.util.List;
import com.classes.DTO.Cliente;

public interface ICliente {
	public boolean inserir(Cliente cliente);
	public boolean alterar(Cliente cliente);
	public boolean existe(Cliente cliente);
	public boolean excluir(Cliente cliente);
	public Cliente procurarPorId(Cliente cliente);
	public List<Cliente> pesquisarTodos();
}
