package naveEspacial;

public class NaveEspacialmain {

	public static void main(String[] args) {
		
		NaveEspacial nave = new NaveEspacial();
		nave.setVelocidadeMaxima(73845.2807454);
		System.out.println(nave);
		
		Apolo11 ap = new Apolo11();
		ap.setVelocidadeMaxima(8720.2834);
		ap.setTipoCombustivel("Petróleo Refinado");
		System.out.println(ap);
		
		MillenniumFalcon mill = new MillenniumFalcon();
		mill.setVelocidadeMaxima(300000000);
		mill.setTipoCombustivel("Hélio-3");
		mill.setClasseHiperpropulsor(78212031f);
		System.out.println(mill);
		

	}

}
