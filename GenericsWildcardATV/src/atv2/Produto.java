package atv2;

import java.time.LocalDate;

public class Produto<T> {
	private T id;
	private Float valor;
	private LocalDate dataFabricacao;
	private LocalDate dataVencimento;
	
	public Produto(T id, Float valor, LocalDate dataFabricacao, LocalDate dataVencimento) {
		this.id = id;
		this.valor = valor;
		this.dataFabricacao = dataFabricacao;
		this.dataVencimento = dataVencimento;
	}

	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
}
