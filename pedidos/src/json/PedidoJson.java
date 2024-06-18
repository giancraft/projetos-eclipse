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

import com.classes.DTO.Cliente;
import com.classes.DTO.Pedido;
import interfaces.IPedido;

public class PedidoJson implements IPedido{
	private List<Pedido> lista = new ArrayList<Pedido>();
	final String ARQUIVO = "json/pedido.json";
	
	public List<Pedido> getLista() {
		return lista;
	}
	public void setLista(List<Pedido> lista) {
		this.lista = lista;
	}
	
	public boolean inserir(Pedido pedido, Cliente cliente) {
		pedido.setId(lista.size() + 1);
		lista.add(pedido);
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
	
	public boolean excluir(Pedido pedido) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pedido.getId())
	    		lista.remove(pedido);
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
	
	public Pedido procurarPorId(Pedido pedido, Cliente cliente) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<Pedido>>(){}.getType();
	    lista = new ArrayList<Pedido>();
	    lista = gson.fromJson(bufferedReader, listType);
	    
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pedido.getId())
	    		return lista.get(i);
	    }
	    return null;
	}
	
	public List<Pedido> pesquisarTodos(Cliente cliente) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<Pedido>>(){}.getType();
	    lista = new ArrayList<Pedido>();
	    lista = gson.fromJson(bufferedReader, listType);
	    return lista;
	}
	
	public boolean existe(Pedido pedido) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == pedido.getId())
	    		return true;
	    }
		return false;
	}
}
