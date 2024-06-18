package Fabrica;

public class FabricaAlunosBCC implements FabricaAluno {
	
	public Alunos criarAluno() {
		return new AlunosBCC();
	}

}
