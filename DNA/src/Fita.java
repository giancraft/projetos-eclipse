import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Fita {
	
	public static void main(String[] args) throws IOException {
		
		File txt = new File("C:\\Users\\paulo\\eclipse-workspace\\DNA\\teste.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(txt));
		
		String fitas;
		ArrayList<String> listaFitas = new ArrayList<String>();
		
		while ((fitas = br.readLine()) != null) {
			listaFitas.add(fitas);
		}
		
		int cont = 0;
		
		for (String result: listaFitas) {
			System.out.println(cont + 1 + ". " + listaFitas.get(cont) + "\n");
			cont++;
		}
		
		int validas = 0;
		int invalidas = 0;
		boolean validacao;
		int j;
		
		cont = 1;
		
		for (int i = 0; i < listaFitas.size(); i++) {
			String[] vetorFitas = listaFitas.get(i).split("");
			validacao = true;
			j = 0;
			while (validacao && j < vetorFitas.length) {
				validacao = (vetorFitas[j] != "A" && vetorFitas[j] != "G" && vetorFitas[j] != "C" && vetorFitas[j] != "T"); 	
				System.out.println(vetorFitas[j]);
				j++;
			}
			if (validacao) 
				validas++;
			else {
				invalidas++;
				System.out.println(i + 1 + ". " + listaFitas.get(i));
			}
			System.out.println("-----------------------------------------------");
		}
	
		System.out.println(validas);
		System.out.println(invalidas);
	}	
}
