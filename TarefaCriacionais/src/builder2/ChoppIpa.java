package builder2;

public class ChoppIpa implements IChopp{
	public void marca(String marca) {
		chopp.setMarca(marca);
	}
	public void pilsen() {
		chopp.setPilsen(false);
	}
	public void ipa() {
		chopp.setIpa(true);
	}
	public void vinho() {
		chopp.setVinho(false);
	}
}
