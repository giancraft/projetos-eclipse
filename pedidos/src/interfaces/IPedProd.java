package interfaces;

import java.util.List;
import com.classes.DTO.Produto;
import com.classes.DTO.Pedido;
import com.classes.DTO.PedProd;

public interface IPedProd {
	public boolean inserir(Pedido pedido, Produto produto, PedProd pp);
	public boolean excluir(PedProd pp);
	public boolean existe(PedProd pp);
	public PedProd procurarPorId(Pedido pedido, PedProd pp, Produto produto);
	public List<PedProd> pesquisarTodos(Pedido pedido);
}
