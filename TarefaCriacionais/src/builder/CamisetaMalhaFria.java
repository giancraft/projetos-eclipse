package builder;

public class CamisetaMalhaFria implements ICamiseta{
	public void marca(String marca) {
		camiseta.setMarca(marca);
	}
	public void algodao() {
		camiseta.setAlgodao(false);
	}
	public void poliester() {
		camiseta.setPoliester(false);
	}
	public void malhaFria() {
		camiseta.setMalhaFria(true);
	}
}
