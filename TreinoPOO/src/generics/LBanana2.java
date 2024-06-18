package generics;

import java.util.List;
import java.util.ArrayList;

public class LBanana2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		Banana b = new Banana("Branca", "Brasil");
		list.add(b);
		Banana b1 = (Banana)list.get(0);
		
		System.out.println(b1.toString());
	}

}
