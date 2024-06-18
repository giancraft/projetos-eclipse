package fluenteInterface;

public class Main {
	public static void main(String[] args) {
		Jogador j1 = new Jogador()
			.nick("GianCraftHD")
			.gostaDe("RPG")
			.jogaEm("Computador");
		System.out.println(j1);
		
		Jedi je1 = new Jedi()
			.nascidoEm("Tatooine")
			.deNome("Pedro")
			.usaSabre("Verde");
		System.out.println(je1);
	}
}
