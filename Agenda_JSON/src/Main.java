import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args)  {
		
		ListPessoas l = new ListPessoas();
		
		Pessoa pes = new Pessoa();
		pes.setCodigo(1);
		pes.setNome("Curvello");
		l.add(pes);
		
		pes = new Pessoa();
		pes.setCodigo(2);
		pes.setNome("Nara");
		l.add(pes);
		
		l.gravar();
		
		l = new ListPessoas();
		
		l.setLista(l.ler());
		
	    for (Pessoa p : l.getLista()) {
			System.out.println(p);
		}
	    
	    l = new ListPessoas();
	    

	   
	 }	
}