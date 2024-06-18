import java.util.List;

public class Persistencia {
	
	private Gravacao g;
	
	public Persistencia(Gravacao g) {
		this.g = g;
	}
	
	public boolean gravar(List<Pessoa> list) {
		return g.gravar(list);
		
	}
	public List<Pessoa> ler(){
		return g.ler();
	}

	
}
