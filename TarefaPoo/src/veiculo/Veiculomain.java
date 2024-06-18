package veiculo;

public class Veiculomain {

	public static void main(String[] args) {
		
		Veiculo vei = new Veiculo();
		vei.setMotor(false);
		System.out.println(vei);
		
		Caminhao cam = new Caminhao();
		cam.setMotor(true);
		cam.setEixos(2);
		System.out.println(cam);
		
		Carro car = new Carro();
		car.setMotor(true);
		car.setPortas(4);
		System.out.println(car);
		
		Moto mo = new Moto();
		mo.setCilindradas(450);
		mo.setMotor(true);
		System.out.println(mo);

	}

}
