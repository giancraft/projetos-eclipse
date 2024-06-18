package atividadeGenerics;

public class Main {

	public static void main(String[] args) {
		
		Integer[] anArray = {2,4,5};
		
		int compare = Comp.<Integer>countGreaterThan(anArray, 3);
		System.out.println(compare);

	}

}
