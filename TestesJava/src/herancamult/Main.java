package herancamult;

public class Main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		ControleRemoto cr = new ControleRemoto();
		
		tv.setCanal(1);
		tv.setEstado(false);
		tv.setVolume(100);
		System.out.println(tv.isEstado());
		
	}
	
}
