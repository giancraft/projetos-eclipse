package interfaces;

import java.util.List;
import com.classes.DTO.Pagamento;
import com.classes.DTO.PedProd;
import com.classes.DTO.Pedido;

public interface IPagamento {
	public boolean inserir(Pagamento pagamento, PedProd pp);
	public boolean alterar(Pagamento pagamento, PedProd pp);
	public boolean existe(Pagamento pagamento);
	public boolean excluir(Pagamento pagamento);
	public Pagamento procurarPorId(Pagamento pagamento, PedProd pp);
	public List<Pagamento> pesquisarTodos(Pedido pedido);
}
