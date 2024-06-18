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
import com.classes.DTO.PedProd;
import com.classes.DTO.Produto;
import interfaces.IPedProd;

public class PedProdJson implements IPedProd{
	private List<PedProd> lista = new ArrayList<PedProd>();
	final String ARQUIVO = "json/pedido.json";
	
	public List<PedProd> getLista() {
		return lista;
	}
	public void setLista(List<PedProd> lista) {
		this.lista = lista;
	}
	
	public boolean inserir(Pedido pedido, Produto produto, PedProd pp) {
		pp.setId(lista.size() + 1);
		lista.add(pp);
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
	
	public boolean excluir(PedProd pp) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pp.getId())
	    		lista.remove(pp);
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
	
	public PedProd procurarPorId(Pedido pedido, PedProd pp, Produto produto) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<PedProd>>(){}.getType();
	    lista = new ArrayList<PedProd>();
	    lista = gson.fromJson(bufferedReader, listType);
	    
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pp.getId())
	    		return lista.get(i);
	    }
	    return null;
	}
	
	public List<PedProd> pesquisarTodos(Pedido pedido) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<PedProd>>(){}.getType();
	    lista = new ArrayList<PedProd>();
	    lista = gson.fromJson(bufferedReader, listType);
	    return lista;
	}
	
	public boolean existe(PedProd pp) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pp.getId())
	    		return true;
	    }
		return false;
	}

}
