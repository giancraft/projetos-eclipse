package construtorFlexivel;

public class Main {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo()
			.chamadoMarca("Toyota")
			.nomeModelo("Corola")
			.quantRodas(4)
			.totalKm(30000f);
		System.out.println(carro);

	}

}
