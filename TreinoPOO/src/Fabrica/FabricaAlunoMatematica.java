package Fabrica;

public class FabricaAlunoMatematica implements FabricaAluno{

	public Alunos criarAluno() {
		return new AlunosMatematica();
	}
	
}
