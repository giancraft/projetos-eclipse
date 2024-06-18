package generics;

import java.util.List;
import java.util.ArrayList;

public class LBanana4 {

	public static void main(String[] args) {
		List<Banana> list = new ArrayList<Banana>();
		Uva b = new Uva("Verde");
		//list.add(b);
		Banana b1 = (Banana)list.get(0);
		
		System.out.println(b1.toString());

	}

}
