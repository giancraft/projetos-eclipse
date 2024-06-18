package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Gianluca");	
		p.setEndereco("Rua XV de Novembro");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Ana Luiz");
		pf.setEndereco("Rua XV de Novembro");
		pf.setCpf("123.456.789-10");
		pf.setEstadoCivil("Solteira");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Vilmar Lindo");
		pj.setEndereco("Rua XV de Novembro");
		pj.setCnpj("01.002.003/0001-04");
		pj.setTipoEmpresa("Alimenticia");
		System.out.println(pj);
		
	}
	
}
