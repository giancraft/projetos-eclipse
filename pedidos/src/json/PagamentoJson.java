package json;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.time.LocalDate;

import com.classes.DTO.Pedido;
import com.classes.DTO.Pagamento;
import com.classes.DTO.PedProd;
import interfaces.IPagamento;

public class PagamentoJson implements IPagamento{
	private List<Pagamento> lista = new ArrayList<Pagamento>();
	final String ARQUIVO = "json/pagamento.json";
	
	public List<Pagamento> getLista() {
		return lista;
	}
	public void setLista(List<Pagamento> lista) {
		this.lista = lista;
	}
	
	public boolean inserir(Pagamento pag, PedProd pp) {
		pag.setId(lista.size() + 1);
		lista.add(pag);
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    FileWriter writer;
		try {
			writer = new FileWriter(ARQUIVO);
			writer.write(gson.toJson(lista));
		    writer.close();
		    return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean excluir(Pagamento pag) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pag.getId())
	    		lista.remove(pag);
	    }
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    FileWriter writer;
		try {
			writer = new FileWriter(ARQUIVO);
			writer.write(gson.toJson(lista));
		    writer.close();
		    return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean alterar(Pagamento pag, PedProd pp) {
		excluir(pag);
		inserir(pag, pp);
		return true;
		
	}
	
	public Pagamento procurarPorId(Pagamento pag, PedProd pp) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<Pagamento>>(){}.getType();
	    lista = new ArrayList<Pagamento>();
	    lista = gson.fromJson(bufferedReader, listType);
	    
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pag.getId())
	    		return lista.get(i);
	    }
	    return null;
	}
	
	public List<Pagamento> pesquisarTodos(Pedido pedido) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<Pagamento>>(){}.getType();
	    lista = new ArrayList<Pagamento>();
	    lista = gson.fromJson(bufferedReader, listType);
	    return lista;
	}
	
	public boolean existe(Pagamento pag) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pag.getId())
	    		return true;
	    }
		return false;
	}
}
