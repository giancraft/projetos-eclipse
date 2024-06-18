package atv4;

import java.util.List;
import java.util.ArrayList;

public class Generic<V> {
	private String chave;
	private V valor;
	
	private List<Generic<V>> lista = new ArrayList<>();
	
	public Generic(String chave, V valor){
		setChave(chave);
		setValor(valor);
	}
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}

	public void addLista(Generic<V> generic) {
		if (lista.isEmpty())
			lista.add(generic);
		for (int i = 0; i < lista.size(); i++) {
			if (!lista.get(i).getChave().equals(generic.getChave()))
				lista.add(generic);
		}
	}
	
	public Generic<V> buscaPorChave(Generic<V> generic) {
		for(int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getChave().equals(generic.getChave()))
				return lista.get(i);
		}
		return null;
	}

	@Override
	public String toString() {
		return "Generic [chave=" + chave + ", valor=" + valor + "]";
	}
}
