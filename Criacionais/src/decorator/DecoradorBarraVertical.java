package decorator;

public class DecoradorBarraVertical extends JanelaDecorator {
	public DecoradorBarraVertical(Janela janelaDecorada) {
		super (janelaDecorada);
	}
	
	public void draw() {
		drawBarraVertical();
		janelaDecorada.draw();
	}
	
	private void drawBarraVertical() {
		System.out.println("Desenha uma barra vertical na janela");
	}
}
