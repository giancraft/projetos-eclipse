package Fabrica;

public class FabricaAlunoFisica implements FabricaAluno {
	
	public Alunos criarAluno() {
		return new AlunosFisica();
	}

}
