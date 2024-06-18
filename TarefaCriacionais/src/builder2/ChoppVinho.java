package builder2;

public class ChoppVinho implements IChopp{
	public void marca(String marca) {
		chopp.setMarca(marca);
	}
	public void pilsen() {
		chopp.setPilsen(true);
	}
	public void ipa() {
		chopp.setIpa(false);
	}
	public void vinho() {
		chopp.setVinho(true);
	}

}
