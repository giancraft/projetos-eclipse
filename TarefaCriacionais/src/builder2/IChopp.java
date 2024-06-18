package builder2;

public interface IChopp {
	Chopp chopp = new Chopp();
	
	public void marca(String marca);
	public void pilsen();
	public void ipa();
	public void vinho();
	
	public default Chopp build() {
		return chopp;
	}
}
