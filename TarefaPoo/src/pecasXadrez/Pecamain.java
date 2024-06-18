package pecasXadrez;

public class Pecamain {

	public static void main(String[] args) {

		Peca peca = new Peca();
		peca.setLinha(3);
		peca.setColuna(5);
		peca.setCor(true);
		peca.setMovimentos(0);
		System.out.println(peca);
		
		Peao peao = new Peao();
		peao.setLinha(2);
		peao.setColuna(7);
		peao.setCor(false);
		peao.setMovimentos(3);
		peao.mover(3, 7);
		System.out.println(peao);
		
		Torre torre = new Torre();
		torre.setLinha(5);
		torre.setColuna(1);
		torre.setCor(true);
		torre.setMovimentos(6);
		torre.mover(5, 6);
		System.out.println(torre);
		
		Rei rei = new Rei();
		rei.setLinha(4);
		rei.setColuna(2);
		rei.setCor(false);
		rei.setMovimentos(1);
		System.out.println(rei);
		
		Rainha rai = new Rainha();
		rai.setLinha(3);
		rai.setColuna(8);
		rai.setCor(true);
		rai.setMovimentos(7);
		System.out.println(rai);
		
		Cavalo ca = new Cavalo();
		ca.setLinha(2);
		ca.setColuna(3);
		ca.setCor(false);
		ca.setMovimentos(3);
		System.out.println(ca);
		
		Bispo bis = new Bispo();
		bis.setLinha(8);
		bis.setColuna(4);
		bis.setCor(true);
		bis.setMovimentos(7);
		System.out.println(bis);
		
	}

}
