package atv9;

public class Funcionario {
	private String nome;
	private float salario;
	private Funcionario prox;
	
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
		this.prox = null;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Funcionario getProx() {
		return prox;
	}
	public void setProx(Funcionario prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", prox=" + prox + "]";
	}
	
}
