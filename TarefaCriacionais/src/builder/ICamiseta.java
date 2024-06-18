package builder;

public interface ICamiseta {
	Camiseta camiseta = new Camiseta();
	
	public void marca(String marca);
	public void algodao();
	public void poliester();
	public void malhaFria();
	
	
	public default Camiseta build() {
		return camiseta;
	}
}
