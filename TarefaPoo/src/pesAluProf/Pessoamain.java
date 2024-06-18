package pesAluProf;

public class Pessoamain {

	public static void main(String[] args) {
		
		Pessoa pes = new Pessoa();
		pes.setCodigo(123);
		pes.setEndereco("Rua Castelo Branco");
		pes.setNome("Gianluca");
		System.out.println(pes);
		
		Aluno alu = new Aluno();
		alu.setCodigo(456);
		alu.setEndereco("Rua das Bromélias");
		alu.setMatricula(202309345);
		alu.setNome("João Costa");
		System.out.println(alu);
		
		Professor prof = new Professor();
		prof.setCodigo(789);
		prof.setDisciplina("Programação Orientada à Objetos");
		prof.setEndereco("Tatooine");
		prof.setNome("Rodrigo Curvello");
		System.out.println(prof);

	}

}
