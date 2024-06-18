package ambiente;

public class Ambientemain {

	public static void main(String[] args) {
		
		Ambiente amb = new Ambiente();
		amb.setArea(34.67f);
		System.out.println(amb);
		
		Quarto qua = new Quarto();
		qua.setArea(23.44f);
		qua.setCapacidade(12);
		System.out.println(qua);
		
		Sala sala = new Sala();
		sala.setArea(64.23f);
		sala.setTv(true);
		System.out.println(sala);
		
		Banheiro ban = new Banheiro();
		ban.setArea(12.98f);
		ban.setBanheira(false);
		System.out.println(ban);
		
		Cozinha co = new Cozinha();
		co.setArea(37.16f);
		co.setMicroondas(true);
		System.out.println(co);
		
	}

}
