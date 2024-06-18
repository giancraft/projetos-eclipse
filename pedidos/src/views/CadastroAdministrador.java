package views;

import java.util.Scanner;
import com.classes.DTO.*;
import com.classes.BO.*;

public class CadastroAdministrador {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Administrador adm = new Administrador();
		//Administrador aux = new Administrador();
		AdministradorBO admBO = new AdministradorBO();
		ProdutoBO produtoBO = new ProdutoBO();
		
		System.out.print("Deseja cadastrar um novo administrador? Se sim, digite (0). Caso queira logar, digite (1)."
				+ "Se não, digite qualquer número: ");
		int resp = entrada.nextInt();
		
		if (resp == 1 || resp == 0) {
			//if (resp == 0) {
				entrada.nextLine();
				System.out.print("Digite o seu nome: ");
				String nome = entrada.nextLine();
				
				System.out.print("Digite o seu email: ");
				String email = entrada.nextLine();
				
				System.out.print("Digite a sua senha: ");
				String senha = entrada.nextLine();
				
				adm = new Administrador(nome, email, senha);
				admBO.inserir(adm);
				//System.out.println(admBO.procurarPorId(adm));
			//} O Login nao esta funcionando para Json
			
			/*entrada.nextLine();
			System.out.print("Digite seu email: ");
			String email = entrada.nextLine();
			
			System.out.print("Digite sua senha: ");
			String senha = entrada.nextLine();
			
			aux = new Administrador(email, senha);
			adm = new Administrador(admBO.procurarPorId(aux).getNome(), admBO.procurarPorId(aux).getEmail(), admBO.procurarPorId(aux).getSenha());*/
			
			System.out.println("As informações do seu perfil são:");
			System.out.println(admBO.procurarPorId(adm));
			
			System.out.print("Deseja atualizar um dado do perfil? Se sim, digite (0). Se não, digite outro número: ");
			resp = entrada.nextInt();
			
			do {	
				if (resp == 0) {
					entrada.nextLine();
					System.out.print("Antes de continuar, confirme seu email para verificação: ");
					email = entrada.nextLine();
				
					System.out.print("Agora confirme sua senha para verificação: ");
					senha = entrada.nextLine();
					
					if (email.equals(admBO.procurarPorId(adm).getEmail()) && senha.equals(admBO.procurarPorId(adm).getSenha())) {
						System.out.print("Digite 1 - nome, 2 - email, 3 - senha: ");
						resp = entrada.nextInt();
					
						while (resp < 1 || resp > 3) {
							System.out.println("Número inválido. Digite um número válido.");
						}
					
						if (resp == 1) {
							entrada.nextLine();
							System.out.print("Digite o nome atualizado: ");
							nome = entrada.nextLine();
							admBO.procurarPorId(adm);
							adm.setNome(nome);
							admBO.alterar(adm);
						} else if (resp == 2) {
							entrada.nextLine();
							System.out.print("Digite o email atualizado: ");
							email = entrada.nextLine();
							admBO.procurarPorId(adm);
							adm.setEmail(email);
							admBO.alterar(adm);
						} else {
							entrada.nextLine();
							System.out.print("Digite a senha atualizada: ");
							senha = entrada.nextLine();
							admBO.procurarPorId(adm);
							adm.setSenha(senha);
							admBO.alterar(adm);
						}
					} else {
						System.out.println("Email ou Senha incorreto.");
					}
					System.out.print("Deseja atualizar mais algum dado? Se sim, digite (0). Se não, digite outro número: ");
					resp = entrada.nextInt();
				}
			} while (resp == 0);
			
			System.out.print("Deseja excluir este perfil de administrador? Se sim, digite (0). Se não, digite outro número: ");
			resp = entrada.nextInt();
			
			if (resp == 0) {
				entrada.nextLine();
				System.out.print("Antes de continuar, confirme seu email para verificação: ");
				email = entrada.nextLine();
				
				System.out.print("Agora confirme sua senha para verificação: ");
				senha = entrada.nextLine();
				
				if (email.equals(admBO.procurarPorId(adm).getEmail()) && senha.equals(admBO.procurarPorId(adm).getSenha())) {
					admBO.procurarPorId(adm);
					admBO.excluir(adm);
					System.out.println("Perfil excluído com sucesso");
				} else {
					System.out.println("Email ou Senha incorreto.");
				}
			} else {
				System.out.print("Deseja cadastrar um novo produto? Se sim, digite (0). Se não, digite qualquer número: ");
				resp = entrada.nextInt();
			
				do {
					if (resp == 0) {
						entrada.nextLine();
						System.out.print("Digite o nome do produto: ");
						String nomeProd = entrada.nextLine();
				
						System.out.print("Digite a descrição do produto: ");
						String descProd = entrada.nextLine();
					
						System.out.print("Digite o preço por unidade do produto: ");
						float precoProd = entrada.nextFloat();
				
						System.out.print("Digite a quantidade disponível do produto: ");
						int quantProd = entrada.nextInt();
				
						Produto prod1 = new Produto(nomeProd, descProd, precoProd, quantProd, adm);
						produtoBO.inserir(prod1, adm);
				
						System.out.print("Deseja visualizar o produto cadastrado? Se sim, digite (0). Se não, digite outro número: ");
						resp = entrada.nextInt();
				
						if (resp == 0) {
							System.out.println(produtoBO.procurarPorId(prod1, adm));
						}
						
						System.out.print("Deseja atualizar algum dado do produto cadastrado? Se sim, digite 0. Se não, digite outro número: ");
						resp = entrada.nextInt();
						
						do {
							if (resp == 0) {
								System.out.print("Digite 1 - nome, 2 - descrição, 3 - preço, 4 - quantidade: ");
								resp = entrada.nextInt();
								
								while (resp < 1 || resp > 4) {
									System.out.print("Número inválido. Digite um número válido: ");
									resp = entrada.nextInt();
								}
								
								if (resp == 1) {
									entrada.nextLine();
									System.out.print("Digite o nome atualizado: ");
									nomeProd = entrada.nextLine();
									produtoBO.procurarPorId(prod1, adm);
									prod1.setNome(nomeProd);
									produtoBO.alterar(prod1, adm);
								} else if (resp == 2) {
									entrada.nextLine();
									System.out.print("Digite a descrição atualizada: ");
									descProd = entrada.nextLine();
									produtoBO.procurarPorId(prod1, adm);
									prod1.setDescricao(descProd);
									produtoBO.alterar(prod1, adm);
								} else if (resp == 3) {
									entrada.nextLine();
									System.out.print("Digite o preço atualizado: ");
									precoProd = entrada.nextFloat();
									produtoBO.procurarPorId(prod1, adm);
									prod1.setPreco(precoProd);
									produtoBO.alterar(prod1, adm);
								} else {
									entrada.nextLine();
									System.out.print("Digite a quantidade atualizada: ");
									quantProd = entrada.nextInt();
									produtoBO.procurarPorId(prod1, adm);
									prod1.setQuantidade(quantProd);
									produtoBO.alterar(prod1, adm);
								}
							}
							System.out.print("Deseja atualizar mais algum dado? Se sim, digite (0). Se não, digite outro número: ");
							resp = entrada.nextInt();
						} while (resp == 0);
				
						System.out.print("Deseja excluir o produto? Se sim, digite (0). Se não, digite outro número: ");
						resp = entrada.nextInt();
						
						if (resp == 0) {
							produtoBO.procurarPorId(prod1, adm);
							produtoBO.excluir(prod1);
							System.out.println("Produto excluído com sucesso");
						}
					}
					System.out.print("Se desejar cadastrar outro produto, digite (0). Caso não queira, digite outro número: ");
					resp = entrada.nextInt();
				} while (resp == 0);
				System.out.println("Cadastro de produto encerrado.");
			}
		entrada.close();
		}
		System.out.println("Sistema encerrado.");
	}
}
