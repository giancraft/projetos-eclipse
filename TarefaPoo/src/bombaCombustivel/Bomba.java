package bombaCombustivel;

public class Bomba {
	
	private double totalLitros;
	private float valorLitros;
	
	public double getTotalLitros() {	
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public float getValorLitros() {
		return valorLitros;
	}
	public void setValorLitros(float valorLitros) {
		this.valorLitros = valorLitros;
	}
	
	public boolean abastecerPorLitro(int litros) {
		totalLitros -= litros;
		return true;
	}
	public boolean abastecerPorValor(double valor) {
		totalLitros -= (valor / valorLitros);
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitros=");
		builder.append(valorLitros);
		builder.append("]");
		return builder.toString();
	}
	
}
