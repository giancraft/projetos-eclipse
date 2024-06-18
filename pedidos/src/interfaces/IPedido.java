package interfaces;

import java.util.List;
import com.classes.DTO.Cliente;
import com.classes.DTO.Pedido;

public interface IPedido {
	public boolean inserir(Pedido pedido, Cliente cliente);
	public boolean excluir(Pedido pedido);
	public boolean existe(Pedido pedido);
	public Pedido procurarPorId(Pedido pedido, Cliente cliente);
	public List<Pedido> pesquisarTodos(Cliente cliente);
}
