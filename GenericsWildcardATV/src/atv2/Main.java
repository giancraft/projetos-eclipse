package atv2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate dataFabricacao = LocalDate.parse("2023-11-21");
		LocalDate dataVencimento = LocalDate.parse("2024-10-15");
		
		Produto<Integer> produto1 = new Produto<>(1, 4.99f, dataFabricacao, dataVencimento);
		System.out.println(produto1);
		
		Produto<String> produto2 = new Produto<>("2", 7.99f, dataFabricacao, dataVencimento);
		System.out.println(produto2);

	}

}
