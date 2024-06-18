package pecasXadrez;

public class Peao extends Peca {
	
	public boolean mover(int linha, int coluna) {
		if (linha == super.getLinha() + 1 && super.getColuna() == coluna && linha <= 8){
			super.setLinha(linha);
			super.setMovimentos(super.getMovimentos() + 1);
			return true;
		} else
			return false;
	}
	
	
}
