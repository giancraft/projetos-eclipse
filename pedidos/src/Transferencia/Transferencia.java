package Transferencia;

import interfaces.*;

public class Transferencia {
	private IAdministrador administradorDAO;
	private ICliente clienteDAO;
	private IPagamento pagamentoDAO;
	private IPedido pedidoDAO;
	private IPedProd pedProdDAO;
	private IProduto produtoDAO;
	
	public IAdministrador getAdministradorDAO() {
		return administradorDAO;
	}
	public void setAdministradorDAO(IAdministrador administradorDAO) {
		this.administradorDAO = administradorDAO;
	}
	public ICliente getClienteDAO() {
		return clienteDAO;
	}
	public void setClienteDAO(ICliente clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	public IPagamento getPagamentoDAO() {
		return pagamentoDAO;
	}
	public void setPagamentoDAO(IPagamento pagamentoDAO) {
		this.pagamentoDAO = pagamentoDAO;
	}
	public IPedido getPedidoDAO() {
		return pedidoDAO;
	}
	public void setPedidoDAO(IPedido pedidoDAO) {
		this.pedidoDAO = pedidoDAO;
	}
	public IPedProd getPedProdDAO() {
		return pedProdDAO;
	}
	public void setPedProdDAO(IPedProd pedProdDAO) {
		this.pedProdDAO = pedProdDAO;
	}
	public IProduto getProdutoDAO() {
		return produtoDAO;
	}
	public void setProdutoDAO(IProduto produtoDAO) {
		this.produtoDAO = produtoDAO;
	}
}
