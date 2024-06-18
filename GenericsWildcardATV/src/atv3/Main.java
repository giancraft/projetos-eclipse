package atv3;

public class Main {

	public static void main(String[] args) {
		Filme filme = new Filme("Homem-Aranha", "Ação", "Sam Raimi", "Tobey Maguire", 120);
		Serie serie = new Serie("Avatar: A Lenda de Aang", "Aventura", "Joaquim Dos Santos", "Zach Tyler Eisen", 60);
		
		Pedido<ProdutoX> pedido = new Pedido<>();
		pedido.addLista(filme);
		pedido.addLista(serie);
		//pedido.getLista().add(filme);
		System.out.println(pedido.mostrarLista());

	}
}
