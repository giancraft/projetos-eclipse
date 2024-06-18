package item;

public class ItemMain {

	public static void main(String[] args) {
		
		Item it = new Item();
		it.setCodigo(12345);
		it.setDescricao("Disco");
		System.out.println(it);
		
		Livro li = new Livro();
		li.setCodigo(67890);
		li.setDescricao("Fantasia Medieval");
		li.setAutor("J. R. R. Tolkien");
		System.out.println(li);
		
		Midia mi = new Midia();
		mi.setCodigo(18394);
		mi.setDescricao("DVD");
		mi.setDuracao(25.6f);
		mi.setGravadora("Apple Records");
		System.out.println(mi);
		
		CD cd = new CD();
		cd.setCodigo(19465);
		cd.setDescricao("Rock Classico");
		cd.setGravadora("Apple Records");
		cd.setDuracao(47.23f);
		cd.setFaixas(17);
		cd.setAlbum("Abbey Road");
		cd.setArtistas("Ringo Starr, Paul McCartney, George Harrison, John Lennon");
		System.out.println(cd);
		
		VHS vhs = new VHS();
		vhs.setCodigo(54783);
		vhs.setDescricao("Fantasia Medieval");
		vhs.setDuracao(177f);
		vhs.setGravadora("Warner Bros.");
		vhs.setTitulo("Senhor dos Aneis");
		System.out.println(vhs);
		
	}

}
