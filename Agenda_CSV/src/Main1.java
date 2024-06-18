import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	public static void main (String[] args) throws IOException {

		ListPessoa l = new ListPessoa();
		
		PersistenciaCSV csv = new PersistenciaCSV();
		Persistencia pers = new Persistencia(csv);

		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("Rodrigo");
		l.add(p);

		p = new Pessoa();
		p.setCodigo(2);
		p.setNome("Angelo");
		l.add(p);
		
		pers.gravar(l.getList());		
		l = new ListPessoa();
		l.setList(pers.ler());
	
		for (Pessoa pessoa : l.getList()) {
			System.out.println(pessoa);
		}
	}
}