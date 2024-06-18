package pecasXadrez;

public class Torre extends Peca {
	
	public boolean mover(int linha, int coluna) {
		if (((super.getLinha() - linha  <= 7|| super.getLinha() - linha >= -7) && super.getColuna() == coluna)
			|| ((super.getColuna() - coluna <= 7 || super.getColuna() - coluna >= -7) && super.getLinha() == linha)) {
			super.setLinha(linha);
			super.setColuna(coluna);
			super.setMovimentos(getMovimentos() + 1);
			return true;
		} else 
			return false;
	}

}
