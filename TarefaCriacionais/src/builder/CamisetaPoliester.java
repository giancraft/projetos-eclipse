package builder;

public class CamisetaPoliester implements ICamiseta {
	public void marca(String marca) {
		camiseta.setMarca(marca);
	}
	public void algodao() {
		camiseta.setAlgodao(false);
	}
	public void poliester() {
		camiseta.setPoliester(true);
	}
	public void malhaFria() {
		camiseta.setMalhaFria(false);
	}
}
