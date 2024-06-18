package simples;

public class Contamain {

	public static void main(String[] args) {
		
		Conta co = new Conta();
		co.setBanco("Banco do Brasil");
		co.setAgencia(12345);
		co.setNumeroconta(123);
		co.setSaldo(450);
		co.deposito(100);
		co.saque(50);
		System.out.println(co);
		
		ContaSimples cs = new ContaSimples();
		cs.setBanco("Banco do Brasil");
		cs.setAgencia(67890);
		cs.setNumeroconta(456);
		cs.setSaldo(500);
		cs.setSaldoPoupanca(400);
		cs.deposito(50);
		cs.saque(100);
		cs.depositoPoupanca(200);
		cs.saquePoupanca(150);
		System.out.println(cs);
		
		ContaEspecial ce = new ContaEspecial();
		ce.setBanco("Bradesco");
		ce.setAgencia(15486);
		ce.setNumeroconta(789);
		ce.setSaldo(500);
		ce.setDiasSemJuros(25);
		ce.setLimite(2000);
		ce.deposito(400);
		ce.saque(200);
		System.out.println(ce);

	}

}
