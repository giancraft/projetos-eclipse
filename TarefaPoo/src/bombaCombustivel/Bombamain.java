package bombaCombustivel;

public class Bombamain {

	public static void main(String[] args) {
		
		Bomba bo = new Bomba();
		bo.setTotalLitros(150);
		bo.setValorLitros(5.89f);
		bo.abastecerPorLitro(30);
		bo.abastecerPorValor(296);
		System.out.println(bo);
		
		BombaGasolina bg = new BombaGasolina();
		bg.setTotalLitros(200);
		bg.setValorLitros(5.69f);
		bg.abastecerPorLitro(25);
		bg.abastecerPorValor(495.32);
		System.out.println(bg);
		
		BombaEtanol be = new BombaEtanol();
		be.setTotalLitros(175);
		be.setValorLitros(4.65f);
		be.abastecerPorLitro(42);
		be.abastecerPorValor(674.2341);
		System.out.println(be);
		
		BombaDiesel bd = new BombaDiesel();
		bd.setTotalLitros(183);
		bd.setValorLitros(5.82f);
		bd.abastecerPorLitro(1743);
		bd.abastecerPorValor(3462.8746);
		System.out.println(bd);

	}

}
