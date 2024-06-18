package builder2;

public class ChoppPilsen implements IChopp{
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
		chopp.setVinho(false);
	}
}
