package builder;

public class CamisetaDirector {
	protected ICamiseta builder;
		public CamisetaDirector(ICamiseta camisetaBuilder) {
			this.builder = camisetaBuilder;
		}
		public void construirCamiseta(String marca) {
			builder.algodao();
			builder.poliester();
			builder.malhaFria();
			builder.marca(marca);
		}
		public Camiseta getCamiseta() {
			return builder.build();
		}
}