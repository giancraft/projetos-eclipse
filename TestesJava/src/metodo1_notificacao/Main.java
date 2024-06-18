package metodo1_notificacao;

public class Main {

	public static void main(String[] args) {
		
		Notificacao n = new Notificacao();
		Alerta a = new Alerta(n);
		System.out.println(a.dispararAlerta());

	}
}
