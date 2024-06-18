import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListClientes {
	
	List<Clientes> lista = new ArrayList<Clientes>();
	
	public ListClientes(){
		
		lista = ManipXML.lerXMLCOM();
	}
	
	public String inserir(Clientes cli){
		String ret = "";
		if (verificarCodigo(cli.getCodigo())){
			lista.add(cli);
			ret = "Cliente gravado com Sucesso.\n";
		}
		else{
			ret = "Código já existente.\n";
		}
		return ret;
	}
	
	public String alterar(Clientes cli){
		lista.add(cli);
		return "Alterado com sucesso";
	}
	
	public String excluir(Clientes cli){
		lista.remove(cli);
		return "Excluido com sucesso.";
	}
	
	public List<Clientes> getLista(){
		return lista;
	}
	
	public Clientes getCliente(int cod){
		Clientes ret = null ;
		
		for (Iterator iter = lista.iterator(); iter.hasNext();) {
			Clientes element = (Clientes) iter.next();
			if(element.getCodigo() == cod){
				ret = element;
			}
		}
		return ret;
	}
	
	
	public Boolean verificarCodigo(int cod){
		Boolean ret = true;
		
		for (Iterator iter = lista.iterator(); iter.hasNext();) {
			Clientes element = (Clientes) iter.next();
			if(element.getCodigo() == cod){
				ret = false;
			}
		}
		
		return ret;
	}
	
}
