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
import com.classes.DTO.Cliente;
import java.time.LocalDate;
import interfaces.ICliente;

public class ClienteJson implements ICliente{
	private List<Cliente> lista = new ArrayList<Cliente>();
	final String ARQUIVO = "json/cliente.json";
	
	public List<Cliente> getLista() {
		return lista;
	}
	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}
	
	public boolean inserir(Cliente cliente) {
		cliente.setId(lista.size() + 1);
		lista.add(cliente);
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
	
	public boolean excluir(Cliente cliente) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == cliente.getId())
	    		lista.remove(cliente);
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
	
	public boolean alterar(Cliente cliente) {
		excluir(cliente);
		inserir(cliente);
		return true;
		
	}

	
	public Cliente procurarPorId(Cliente cliente) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<Cliente>>(){}.getType();
	    lista = new ArrayList<Cliente>();
	    lista = gson.fromJson(bufferedReader, listType);
	    
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == cliente.getId())
	    		return lista.get(i);
	    }
	    return null;
	}
	
	public List<Cliente> pesquisarTodos() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
	    Type listType = new TypeToken<ArrayList<Cliente>>(){}.getType();
	    lista = new ArrayList<Cliente>();
	    lista = gson.fromJson(bufferedReader, listType);
	    return lista;
	}
	
	public boolean existe(Cliente cliente) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == cliente.getId())
	    		return true;
	    }
		return false;
	}
	
}
