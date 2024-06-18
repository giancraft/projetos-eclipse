package com.classes.DTO;

public class PedProd extends Id {
	
	private Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PedProd [pedido=");
		builder.append(pedido);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
