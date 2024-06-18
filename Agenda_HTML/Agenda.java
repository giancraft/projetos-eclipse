import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	protected List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public boolean addPessoa(Pessoa pes) {
		lista.add(pes);
		return true;
	}
	
	public String listar() {
		StringBuilder saida = new StringBuilder();
		for (Pessoa pessoa : lista) {
			saida.append(pessoa.toString());
			saida.append("\n-------------------------\n");
		}	
		return saida.toString();
	}
}
