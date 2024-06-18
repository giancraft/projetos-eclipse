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
import com.classes.DTO.Produto;
import interfaces.IProduto;

public class ProdutoJson implements IProduto{
	private List<Produto> lista = new ArrayList<Produto>();
	final String ARQUIVO = "json/produto.json";
	
	public List<Produto> getLista() {
		return lista;
	}
	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}
	
	public boolean inserir(Produto produto, Administrador administrador) {
		produto.setId(lista.size() + 1);
		lista.add(produto);
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
	
	public boolean excluir(Produto produto) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == produto.getId())
	    		lista.remove(produto);
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
	
	public boolean alterar(Produto produto, Administrador adm) {
		excluir(produto);
		inserir(produto, adm);
		return true;	
	}
	
	public Produto procurarPorId(Produto produto, Administrador adm) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Produto>>(){}.getType();
	    lista = new ArrayList<Produto>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == produto.getId())
	    		return lista.get(i);
	    }
	    return null;
	}
	
	public List<Produto> pesquisarTodos(Administrador adm){
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader(ARQUIVO));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Produto>>(){}.getType();
	    lista = new ArrayList<Produto>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}
	
	public boolean existe(Produto produto) {
		for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == produto.getId())
	    		return true;
	    }
		return false;
	}
}
