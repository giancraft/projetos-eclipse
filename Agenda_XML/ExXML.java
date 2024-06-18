		import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExXML {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		ListClientes lista = new ListClientes();
		Clientes cli = new Clientes();
		
		Scanner entrada = new Scanner(System.in);
		List<Clientes> list = ManipXML.lerXMLCOM();
		
		while(menu.sair == false){
			System.out.println("\nCadastro Clientes\n" +
					"Menu:\n" +
					"1 - Inserir\n" +
					"2 - Alterar\n" +
					"3 - Excluir\n" +
					"4 - Exibir Todas\n" +
					"5 - Sair\n\n");
			
			System.out.print("Escolha uma opção: ");
			menu.setOpcaoMenu(entrada.nextInt());
			
			switch (menu.getOpcaoMenu()) {
			case 1:
				cli = new Clientes();
				System.out.println("Codigo: ");
				cli.setCodigo(entrada.nextInt());
				entrada.nextLine();
				
				//cli.setCodigo(147);
				//cli.setNome("Priscila");
				//cli.setEmail("prih.m.c@gmail.com");
				//cli.setFone("9168 6446");
				
				
				System.out.print("Informe o nome: ");
				cli.setNome(entrada.nextLine());
				
				System.out.print("Informe o e-mail: ");
				cli.setEmail(entrada.nextLine());
				
				System.out.print("Informe o fone: ");
				cli.setFone(entrada.nextLine());
				
				System.out.println(lista.inserir(cli));
				
				break;
			case 2:

				int cod;
				
				System.out.print("Pesquisar\nCodigo: ");
				cod = entrada.nextInt();
				entrada.nextLine();
				
				Clientes alterar = lista.getCliente(cod);
				Clientes antigo = alterar;
				
				
				if(alterar == null)
					System.out.println("Informe um cliente!");
				else{
					System.out.println(alterar.toString());
					
					System.out.print("Alterar\n ");
					

					System.out.print("Informe o nome: ");
					alterar.setNome(entrada.nextLine());
				
					
					System.out.print("Informe o e-mail: ");
					alterar.setEmail(entrada.nextLine());
					
					
					System.out.print("Informe o fone: ");
					alterar.setFone(entrada.nextLine());
					
					
					lista.excluir(antigo);
					System.out.println(lista.alterar(alterar));
				}
				break;
				
			case 3:
				
				int codExcluir = 0;
				boolean confirmExcluir;
				
				System.out.print("Excluir\nCodigo: ");
				codExcluir = entrada.nextInt();
				Clientes excluir = lista.getCliente(codExcluir);
				
				if(excluir == null)
					System.out.println("Informe um Cliente!");
				else{
					System.out.println(excluir.toString());
					
					System.out.print("Excluir cliente?(True/False) ");
					confirmExcluir = entrada.nextBoolean();
					
					if (confirmExcluir){
						System.out.println(lista.excluir(excluir));
					}
				}
				break;
			case 4:
				
				list = lista.getLista();
				for (Iterator iter = list.iterator(); iter.hasNext();) {
					Clientes element = (Clientes) iter.next();
					System.out.println(element.toString() + "\n---");	
				}	
				
				break;
			case 5:
              Boolean gerar = false;
				ManipXML.gravarXML(lista.getLista());
				System.out.println("Deseja criar um arquivo HTML com os dados? (True/False) ");
				gerar = entrada.nextBoolean();
				if (gerar == true){
					
					try {
						FileWriter out = new FileWriter("arquivo.html");
						out.write("<html>\r\n<head><title>LISTA DE CLIENTES</title></head>\r\n<body>\r\n");
						
						list = lista.getLista();
						for (Iterator iter = list.iterator(); iter.hasNext();) {
							Clientes element = (Clientes) iter.next();
							out.write(element.getCodigo() + "<br>" + element.getNome() + "<br>" + element.getEmail() + "<br>" + element.getFone() + "<br>-----<br>");
						}	
						
						out.write("</body>\r\n");
						out.write("</html>\r\n");
						
						out.close();
						System.out.println("Arquivo gerado com sucesso.");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}					
				menu.sair = true;
				break;
			default:
				break;
			}
			
		}
		
	}
}