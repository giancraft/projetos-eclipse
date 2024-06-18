package construtorFlexivel;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int numRodas;
	private float kmRodado;
	
	public Veiculo chamadoMarca(String marca) {
		this.marca = marca;
		return this;
	}
	
	public Veiculo nomeModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}
	
	public Veiculo quantRodas(int numRodas) {
		this.numRodas = numRodas;
		return this;
	}
	
	public Veiculo totalKm(float kmRodado) {
		this.kmRodado = kmRodado;
		return this;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", numRodas=" + numRodas + ", kmRodado=" + kmRodado
				+ "]";
	}
	
	

}
