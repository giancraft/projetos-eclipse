package generics;

import java.util.List;
import java.util.ArrayList;

public class LBanana {

	public static void main(String[] args) {
		List<Banana> list = new ArrayList<Banana>();
		Banana b = new Banana("Branca", "Brasil");
		list.add(b);
		Banana b1 = list.get(0);
		
		System.out.println(b1.toString());
	}

}
