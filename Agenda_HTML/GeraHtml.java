import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class GeraHtml {
 
  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
 
    FileWriter arq = new FileWriter("bcc.html");
    PrintWriter gravarArq = new PrintWriter(arq);
    
    gravarArq.printf("%s\n",cabecalho());
    
    String nome;
    do {
    	nome = ler.nextLine();
    	StringBuilder saida = new StringBuilder();
    	saida.append("<tr><td>");
    	saida.append(nome);
    	saida.append("</td></tr>\n");
      gravarArq.printf("%s\n",saida);
    }while(nome.length() > 0);
    
    gravarArq.printf("%s\n",rodape());
    
    arq.close();    
    ler.close();
  }
  
  public static String cabecalho() {
	  StringBuilder html = new StringBuilder(); 
	  html.append("<!DOCTYPE html>\n");
	  html.append("<html>\n");
	  html.append("<head><title>Listas</title>\n");
	  html.append("<meta charset=\"UTF-8\">\n");
      html.append("</head>\n");
      html.append("<body>\n");
      html.append("<table border=\"1\">\n");
      html.append("<tr><td>Nome</td></tr>\n");
	  return html.toString();
  }
  
  public static String rodape() {
	  StringBuilder html = new StringBuilder(); 
	  html.append("</table>\n");
	  html.append("</body>\n");
	  html.append("</html>\n");
	  return html.toString();
  }
}