package Fabrica;

public class Main {

	public static void main(String[] args) {
		FabricaAluno fabrica = new FabricaAlunosBCC();
		Alunos aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoFisica();
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());
		
		fabrica = new FabricaAlunoMatematica();
		aluno = fabrica.criarAluno();
		System.out.println(aluno.exibirInfo());

	}

}
