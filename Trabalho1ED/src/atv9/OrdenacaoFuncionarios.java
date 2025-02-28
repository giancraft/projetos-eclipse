package atv9;

import java.util.*;

public class OrdenacaoFuncionarios {
private Funcionario inicio;
	
	public OrdenacaoFuncionarios() {
		inicio = null;
	}

	public Funcionario getInicio() {
		return inicio;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public void inserirInicio(String nome, float salario) {
		Funcionario novoFuncionario = new Funcionario(nome, salario);
		novoFuncionario.setProx(inicio);
		inicio = novoFuncionario;
	}
	
	public void inserirFinal(String nome, float salario) {
		if (vazia()) {
			inserirInicio(nome, salario);
			return;
		}
		Funcionario novoNodo = new Funcionario(nome, salario);
		Funcionario aux = inicio;
		while (aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
	}
	
	public void mostrarLista() {
		if(vazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		Funcionario aux = inicio;
		while (aux != null) {
			System.out.println("Nome: " + aux.getNome() + ", Salario: R$ ");
			aux = aux.getProx();
		}
		System.out.println();
	}	
	
	public void ordenaLista(float valor) { //Inserir o valor para a 'c' da atividade
		List<Funcionario> lista = new ArrayList<>();
		Funcionario aux = inicio;
		while (aux != null) {
	        lista.add(new Funcionario(aux.getNome(), aux.getSalario()));
	        aux = aux.getProx();
		}
		for (int i = 0; i < lista.size() - 1; i++) {
	        for (int j = 0; j < lista.size() - i - 1; j++) {
	            if (lista.get(j).getSalario() < lista.get(j + 1).getSalario()) {
	                Funcionario temp = lista.get(j);
	                lista.set(j, lista.get(j + 1));
	                lista.set(j + 1, temp);
	            }
	        }
	    }
		OrdenacaoFuncionarios of = new OrdenacaoFuncionarios();
		List<String> listaMaior = new ArrayList<>();
		listaMaior.add(lista.get(0).getNome());
		float soma = 0;
		int faixa = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			of.inserirFinal(lista.get(i).getNome(), lista.get(i).getSalario());
			if (i > 0) {
				if (lista.get(0).getSalario() == lista.get(i).getSalario()) {
					listaMaior.add(lista.get(i).getNome());
				}
			}
			soma += lista.get(i).getSalario();
			if (lista.get(i).getSalario() > valor) {
				faixa++;
			}
		}
		
		float media = soma / lista.size();
		System.out.println("O(os) funcionario(os) com maior(es) salário(os) é(sao): " + listaMaior);
		System.out.println("A média salarial é: " + media);
		if (faixa == 0)
			System.out.println("Nenhum funcionário atende a esta faixa.");
		else
			System.out.println("A quantidade de funcionários que atendem essa faixa é: " + faixa);
		
		aux = of.getInicio();
	}
}
