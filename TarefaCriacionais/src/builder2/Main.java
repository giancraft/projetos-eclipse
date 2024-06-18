package builder2;

public class Main {
	public static void main(String[] args) {
		ChoppDirector cd = 
			new ChoppDirector(new ChoppPilsen());
			cd.construindoChopp("Heineken");
			Chopp ch1 = cd.getChopp();
			System.out.println(ch1);
			
			cd = new ChoppDirector(new ChoppPilsen());
			cd.construindoChopp("Brahma");
			Chopp ch2 = cd.getChopp();
			System.out.println(ch2);
			
			cd = new ChoppDirector(new ChoppPilsen());
			cd.construindoChopp("Herdt");
			Chopp ch3 = cd.getChopp();
			System.out.println(ch3);
	}
}
