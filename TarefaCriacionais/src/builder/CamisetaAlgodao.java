package builder;

public class CamisetaAlgodao implements ICamiseta{
	public void marca(String marca) {
		camiseta.setMarca(marca);
	}
	public void algodao() {
		camiseta.setAlgodao(true);
	}
	public void poliester() {
		camiseta.setPoliester(false);
	}
	public void malhaFria() {
		camiseta.setMalhaFria(false);
	}	
}
