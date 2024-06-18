package atv7;

import java.util.*;

public class ListaPrioridade {
	private Paciente inicio;
	private Paciente fim;
	private int limite;
	private int tamanho = 0;
	
	public ListaPrioridade(int limite) {
		this.limite = limite;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean temEspaco() {
		return limite > tamanho;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public Paciente getInicio() {
		if (!estaVazio()) return inicio;
		else {
			System.out.println("Fila está vazia");
			return null;
		}
	}
	
	public void inserir(String nome, int nivel) {
		if(temEspaco()) {
			Paciente novoItem = new Paciente(nome, nivel);
			if(estaVazio()) {
				inicio = novoItem;
				fim = novoItem;
			} else {
				fim.setProx(novoItem);
				fim = novoItem;
			}
			tamanho++;
		} else
			System.out.println("Fila cheia!");
	}
	
	public Integer remover() {
		if (estaVazio()) return null;
		int valor = inicio.getNivelUrgencia();
		inicio = inicio.getProx();
		tamanho--;
		if (estaVazio()) {
			fim = null;
		}
		return valor;
	}
	
	public void mostrarLista() {
		Paciente aux = inicio;
		while (aux != null) {
			System.out.println("Nome: " + aux.getNomePaciente() + ", Nível Urgencia: " + aux.getNivelUrgencia());
			aux = aux.getProx();
		}
	}
	
	public void ordenarPacientes() {
		List<Paciente> lista = new ArrayList<>();
		Paciente aux = inicio;
		while (aux != null) {
	        lista.add(new Paciente(aux.getNomePaciente(), aux.getNivelUrgencia()));
	        aux = aux.getProx();
		}
		for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).getNivelUrgencia() > lista.get(j + 1).getNivelUrgencia()) {
                    Paciente temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

		ListaPrioridade listaPrioridade = new ListaPrioridade(limite);
		
		for (int i = 0; i < lista.size(); i++) {
			listaPrioridade.inserir(lista.get(i).getNomePaciente(), lista.get(i).getNivelUrgencia());
		}
		
		aux = listaPrioridade.getInicio();
		while (aux != null) {
			System.out.println("Nome: " + aux.getNomePaciente() + ", Nível Urgencia: " + aux.getNivelUrgencia());
			aux = aux.getProx();
		}
	}
	
}
