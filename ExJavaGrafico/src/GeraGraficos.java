import java.util.Scanner;

import java.util.Random;

import java.io.FileWriter;
import java.io.IOException;

public class GeraGraficos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		System.out.print("Insira a quantidade de números a serem gerados: ");
		int quantidade = entrada.nextInt();
		System.out.print("Informe o valor mínimo possível da amostra: ");
		int minimo = entrada.nextInt();
		System.out.print("Informe o valor máximo possível da amostra: ");
		int maximo = entrada.nextInt();
		
		int[] amostra = new int[quantidade];
		
		for (int x = 0; x < quantidade; x++) {
			amostra[x] = aleatorio.nextInt(minimo, maximo + 1);
		}
		
		String caminhoArquivo = "grafico.html";
		String conteudo = "<html>\r\n"
				+ "  <head>\r\n"
				+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "    <script type=\"text/javascript\">\r\n"
				+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "      google.charts.setOnLoadCallback(drawChart);\r\n"
				+ "\r\n"
				+ "      function drawChart() {\r\n"
				+ "        var data = google.visualization.arrayToDataTable([\r\n"
				+ "          ['Contador', 'Números'],\r\n";
		
			for (int x = 1; x <= quantidade; x++) {
				conteudo += "['" + x + "', " + amostra[x - 1] + "]";
				if (x != quantidade)
					conteudo += ",";
			}
				
			conteudo += "\r\n"
				+ "        ]);\r\n"
				+ "\r\n"
				+ "        var options = {\r\n"
				+ "          title: 'Amostra de Número',\r\n"
				+ "          curveType: 'function',\r\n"
				+ "          legend: { position: 'bottom' }\r\n"
				+ "        };\r\n"
				+ "\r\n"
				+ "        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
				+ "\r\n"
				+ "        chart.draw(data, options);\r\n"
				+ "      }\r\n"
				+ "    </script>\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n"
				+ "  </body>\r\n"
				+ "</html>";
		
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			
			writer.write(conteudo);
			
			writer.close();
			
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
		}
		
		entrada.close();
	}
}
