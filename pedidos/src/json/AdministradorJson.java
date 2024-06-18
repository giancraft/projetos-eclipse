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
import com.classes.DTO.Administrador;
import interfaces.IAdministrador;

public class AdministradorJson implements IAdministrador{
	private List<Administrador> lista = new ArrayList<Administrador>();
	final String ARQUIVO = "json/administrador.json";
	
	public List<Administrador> getLista() {
		return lista;
	}
	public void setLista(List<Administrador> lista) {
		this.lista = lista;
	}
	
	public boolean inserir(Administrador administrador) {
		administrador.setId(lista.size() + 1);
		lista.add(administrador);
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
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
	
	public boolean excluir(Administrador adm) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == adm.getId())
	    		lista.remove(adm);
	    }
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
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
	
	public boolean alterar(Administrador adm) {
		excluir(adm);
		inserir(adm);
		return true;	
	}
	
	public Administrador procurarPorId(Administrador adm) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Administrador>>(){}.getType();
	    lista = new ArrayList<Administrador>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == adm.getId() || lista.get(i).getEmail() == adm.getEmail() || lista.get(i).getSenha() == adm.getSenha())
	    		return lista.get(i);
	    }
	    return null;
	}
	
	public List<Administrador> pesquisarTodos() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Administrador>>(){}.getType();
	    lista = new ArrayList<Administrador>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}
	
	public boolean existe(Administrador adm) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == adm.getId())
	    		return true;
	    }
		return false;
	}
}
