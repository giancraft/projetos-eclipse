package views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.classes.DTO.*;
import com.classes.BO.*;

//Primeiro faca o cadastro de administrador antes deste.

public class CadastroCliente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ClienteBO cliBO = new ClienteBO();
		Cliente cli1 = new Cliente();
		//Cliente aux = new Cliente();
		PedProd pp = new PedProd();
		ProdutoBO produtoBO = new ProdutoBO();
		PedidoBO pedidoBO = new PedidoBO();
		PedProdBO pedProdBO = new PedProdBO();
		PagamentoBO pagamentoBO = new PagamentoBO();
		List<Produto> escolha = new ArrayList<Produto>();
		
		
		System.out.print("Olá! Se você deseja se cadastrar, digite (0). Caso queira logar, digite (1). "
				+ "Se não, digite outro número: ");
		int resp1 = entrada.nextInt();
		
		if (resp1 == 0 || resp1 == 1) {
			//if (resp1 == 0) {
				entrada.nextLine();
				System.out.print("Digite seu nome: ");
				String nome = entrada.nextLine();
				
				System.out.print("Digite seu email: ");
				String email = entrada.nextLine();
				
				System.out.print("Digite sua senha: ");
				String senha = entrada.nextLine();
				
				System.out.print("Digite seu endereço: ");
				String endereco = entrada.nextLine();
				
				System.out.print("Digite seu número de telefone: ");
				String numTel = entrada.nextLine();
				
				System.out.print("Digite sua data de nascimento: ");
				String dataNasc = entrada.nextLine();
				
				LocalDate dataNascimento = LocalDate.parse(dataNasc);
				
				cli1 = new Cliente(nome, email, senha, endereco, numTel, dataNascimento);
				cliBO.inserir(cli1);
			//} O login nao esta funcionando para o Json
			
			/*entrada.nextLine();
			System.out.print("Digite seu email: ");
			String email = entrada.nextLine();
			
			System.out.print("Digite sua senha: ");
			String senha = entrada.nextLine();
			
			aux = new Cliente(email, senha);
			cli1 = new Cliente(cliBO.procurarPorId(aux).getNome(), cliBO.procurarPorId(aux).getEmail(), cliBO.procurarPorId(aux).getSenha(),
			cliBO.procurarPorId(aux).getEndereco(), cliBO.procurarPorId(aux).getNumeroTel(), cliBO.procurarPorId(aux).getDataNascimento());*/
			
			System.out.println("Os dados cadastrados são:");
			System.out.println(cliBO.procurarPorId(cli1));
			
			int resp;
			System.out.print("Deseja mudar alguma informação do seu perfil? se sim, digite (0). Se não, digite outro número: ");
			resp = entrada.nextInt();
			
			do {
				if (resp == 0) {
					System.out.print("Digite 1 - nome, 2 - email, 3 - senha, 4 - endereço, 5 - telefone, 6 - dataNascimento: ");
					resp = entrada.nextInt();
					
					while (resp < 1 && resp > 6) {
						System.out.print("Opção inválida. Digite uma opção válida: ");
						resp = entrada.nextInt();
					}
					entrada.nextLine();
					System.out.print("Antes de modificar, digite seu email para verificação: ");
					email = entrada.nextLine();
				
					System.out.print("Agora sua senha para verificação: ");
					senha = entrada.nextLine();
				
					if (email.equals(cliBO.procurarPorId(cli1).getEmail()) && senha.equals(cliBO.procurarPorId(cli1).getSenha())) {
						if (resp == 1) {
							System.out.print("Digite o nome atualizado: ");
							nome = entrada.nextLine();
							cliBO.procurarPorId(cli1);
							cli1.setNome(nome);
							cliBO.alterar(cli1);
						} else if (resp == 2) {
							System.out.print("Digite o email atualizado: ");
							email = entrada.nextLine();
							cliBO.procurarPorId(cli1);
							cli1.setEmail(email);
							cliBO.alterar(cli1);
						} else if (resp == 3) {
							System.out.print("Digite a senha atualizada: ");
							senha = entrada.nextLine();
							cliBO.procurarPorId(cli1);
							cli1.setSenha(senha);
							cliBO.alterar(cli1);
						} else if (resp == 4) {
							System.out.print("Digite o endereço atualizado: ");
							endereco = entrada.nextLine();
							cliBO.procurarPorId(cli1);
							cli1.setEndereco(endereco);
							cliBO.alterar(cli1);
						} else if (resp == 5) {
							System.out.print("Digite o telefone atualizado: ");
							numTel = entrada.nextLine();
							cliBO.procurarPorId(cli1);
							cli1.setNumeroTel(numTel);
							cliBO.alterar(cli1);
						} else {
							System.out.println("Digite a data de nascimento atualizada: ");
							dataNasc = entrada.nextLine();
							cliBO.procurarPorId(cli1);
							dataNascimento = LocalDate.parse(dataNasc);
							cli1.setDataNascimento(dataNascimento);
							cliBO.alterar(cli1);
						}
					} else {
						System.out.println("Email ou Senha incorreto.");
					}
					System.out.print("Deseja mudar mais alguma informação? Se sim, digite (0). Se não, digite outro número: ");
					resp = entrada.nextInt();
				}
			} while (resp == 0);
			
			System.out.print("Deseja excluir o seu perfil? Se sim, digite (0). Se não, digite outro número: ");
			resp = entrada.nextInt();
			
			if (resp == 0) {
				entrada.nextLine();
				System.out.print("Antes de efetuar a ação, digite seu email para verificação: ");
				email = entrada.nextLine();
				
				System.out.print("Agora sua senha para verificação: ");
				senha = entrada.nextLine();
				
				if (email.equals(cliBO.procurarPorId(cli1).getEmail()) && senha.equals(cliBO.procurarPorId(cli1).getSenha())) {
					cliBO.procurarPorId(cli1);
					cliBO.excluir(cli1);
					System.out.println("Perfil excluído com sucesso");
				} else {
					System.out.println("Email ou Senha incorreto.");
				}
			} else {
				
				System.out.println("Se desejar realizar o seu pedido, digite (0). Caso não queira fazer mais nada, digite qualquer outro número");
				resp = entrada.nextInt();
				
				do {
					if (resp == 0) {
				
						System.out.println("Os produtos que possuímos no catálogo são:");
						for (int i = 0; i < produtoBO.pesquisarTodos(null).size(); i++) {
							produtoBO.procurarPorId(produtoBO.pesquisarTodos(null).get(i), null);
							int auxi = produtoBO.pesquisarTodos(null).get(i).getId();
							System.out.println("Número: " + auxi + " " + produtoBO.pesquisarTodos(null).get(i));
						}
				
						System.out.print("O que você gostaria de pedir? Digite o número referente ao pedido: ");
						resp = entrada.nextInt();
						
						for (int i = 0; i < produtoBO.pesquisarTodos(null).size(); i++) {
							produtoBO.procurarPorId(produtoBO.pesquisarTodos(null).get(i), null);
							int auxi = produtoBO.pesquisarTodos(null).get(i).getId();
							if (resp == auxi) 
								escolha.add(produtoBO.pesquisarTodos(null).get(i));
						}
						LocalDate dataAtual = LocalDate.now();
						Pedido ped1 = new Pedido(dataAtual, escolha, cli1);
				
						do {
							System.out.print("Deseja adicionar mais algum produto? Se sim, digite (0). Caso não queira, digite qualquer outro número: ");
							resp1 = entrada.nextInt();
							if (resp1 == 0) {
								System.out.println("Os produtos que possuímos no catálogo são:");
								for (int i = 0; i < produtoBO.pesquisarTodos(null).size(); i++) {
									produtoBO.procurarPorId(produtoBO.pesquisarTodos(null).get(i), null);
									int auxi = produtoBO.pesquisarTodos(null).get(i).getId();
									System.out.println("Número: " + auxi + " " + produtoBO.pesquisarTodos(null).get(i));
								}
						
								System.out.print("O que você gostaria de pedir? Digite o número referente ao pedido: ");
								resp = entrada.nextInt();
								
								for (int i = 0; i < produtoBO.pesquisarTodos(null).size(); i++) {
									produtoBO.procurarPorId(produtoBO.pesquisarTodos(null).get(i), null);
									int auxi = produtoBO.pesquisarTodos(null).get(i).getId();
									if (resp == auxi) 
										escolha.add(produtoBO.pesquisarTodos(null).get(i));
								}
								dataAtual = LocalDate.now();
								ped1 = new Pedido(dataAtual, escolha, cli1);
							}
						} while (resp1 == 0);
						do {
							System.out.print("Deseja remover algum produto? Se sim, digite (0). Se não, digite qualquer número: ");
							resp = entrada.nextInt();
					
							if (resp == 0) {
								System.out.print("Digite o produto você deseja remover: ");
								resp1 = entrada.nextInt();
								
								int count = 0;
								System.out.println(produtoBO.pesquisarTodos(null).size());
								for (int i = 0; i < produtoBO.pesquisarTodos(null).size(); i++) {
									produtoBO.procurarPorId(produtoBO.pesquisarTodos(null).get(i), null);
									int auxi = produtoBO.pesquisarTodos(null).get(i).getId();
									if (resp1 == auxi) {
										escolha.remove(count);
										ped1.setProdutos(escolha);
									}
									count++;
								}
							}
						} while (resp == 0);
				
						entrada.nextLine();
						System.out.print("Caso queira visualizar o seu pedido, digite (0), se não, digite qualquer outro número: ");
						resp = entrada.nextInt();
						
						pedidoBO.inserir(ped1, cli1);
						
						if (resp == 0) {
							cliBO.procurarPorId(cli1);
							System.out.println(pedidoBO.procurarPorId(ped1, cli1));
							System.out.println(ped1.getProdutos());
						}
						
						for (int i = 0; i < escolha.size(); i++) {
							cliBO.procurarPorId(cli1);
							pedidoBO.procurarPorId(ped1, cli1);
							pedProdBO.inserir(ped1, escolha.get(i), pp);
						}
						
						pp.setPedido(ped1);
						
						System.out.print("Caso queira deletar o seu pedido, digite (0). Caso não queira, digite qualquer número: ");
						resp = entrada.nextInt();
				
						if (resp == 0) {
							cliBO.procurarPorId(cli1);
							pedidoBO.procurarPorId(ped1, cli1);
							pedidoBO.excluir(ped1);
							System.out.println("Pedido deletado com sucesso.");
							escolha.clear();
						} else {
							System.out.print("Como pagamento, digite o método a ser utilizado (exemplo: dinheiro): ");
							entrada.nextLine();
							String forma = entrada.nextLine();
				
							Pagamento pag1 = new Pagamento (forma, ped1);
							pag1.totalPagar(ped1);
							
							for (int i = 0; i < pedProdBO.pesquisarTodos(ped1).size(); i++) {
								cliBO.procurarPorId(cli1);
								pedidoBO.procurarPorId(ped1, cli1);
								pedProdBO.procurarPorId(ped1, pp, escolha.get(i));
								pagamentoBO.inserir(pag1, pp);
							}
				
							System.out.println("Os dados em relação ao pagamento são: ");
							cliBO.procurarPorId(cli1);
							pedidoBO.procurarPorId(ped1, cli1);
							pedProdBO.procurarPorId(ped1, pp, escolha.get(0));
							System.out.println(pagamentoBO.procurarPorId(pag1, pp));
						
							System.out.println("Pedido realizado com sucesso.");
						}
						System.out.print("Se Desejar realizar outro pedido, digite (0). Caso não queira, digite outro número: ");
						resp = entrada.nextInt();
						escolha.clear();
					}
				} while (resp == 0);
			}
		System.out.println("Sistema encerrado.");
		entrada.close();
		}
	}
}
