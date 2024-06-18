/*
 * crud - inserir, alterar, excluir e listar
 * não permitir nomes iguais
 * nomes maiores que 2 caracteres
 * buscar email pelo dominio e listar pessoas
 * listar aniversariantes por mês (html)
 * validar email
 * relatório geral em html
 * exportar dados
 * 
 * 
 * 
 */



public class Main {

	public static void main(String[] args) {
		
		Agenda agenda =  new Agenda();
		
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setNome("Rodrigo");
		
		agenda.addPessoa(p);
		
		p = new Pessoa();
		p.setCodigo(2);
		p.setNome("Angelo");
		
		agenda.addPessoa(p);
		
		System.out.println(agenda.listar());
		
		
		
		
		
		

	}

}
