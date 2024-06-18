package builder;

public class Camiseta {
	private String marca;
	private boolean algodao;
	private boolean poliester;
	private boolean malhaFria;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isAlgodao() {
		return algodao;
	}
	public void setAlgodao(boolean algodao) {
		this.algodao = algodao;
	}
	public boolean isPoliester() {
		return poliester;
	}
	public void setPoliester(boolean poliester) {
		this.poliester = poliester;
	}
	public boolean isMalhaFria() {
		return malhaFria;
	}
	public void setMalhaFria(boolean malhaFria) {
		this.malhaFria = malhaFria;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Camiseta [marca=");
		builder.append(marca);
		builder.append(", algodao=");
		builder.append(algodao);
		builder.append(", poliester=");
		builder.append(poliester);
		builder.append(", malhaFria=");
		builder.append(malhaFria);
		builder.append("]");
		return builder.toString();
	}
}
