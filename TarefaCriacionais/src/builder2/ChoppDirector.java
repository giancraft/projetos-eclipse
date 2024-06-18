package builder2;

public class ChoppDirector {
	protected IChopp builder;
		public ChoppDirector(IChopp choppBuilder) {
			this.builder = choppBuilder;
		}
		
		public void construindoChopp(String marca) {
			builder.marca(marca);
			builder.pilsen();
			builder.ipa();
			builder.vinho();
		}
		
		public Chopp getChopp() {
			return builder.build();
		}
}
