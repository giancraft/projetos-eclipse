import java.util.ArrayList;
import java.util.List;

public class ListPessoa {
	
	List<Pessoa> list = new ArrayList<Pessoa>();
	
	public boolean add(Pessoa pessoa) {
		list.add(pessoa);
		return true;
	}
	
	public List<Pessoa> getList(){
		return list;
	}
	
	public void setList(List<Pessoa> list){
		this.list = list;
	}

}
