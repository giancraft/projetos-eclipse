import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;
public class Ping {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Insira o IP do servidor: ");
		String ip = input.nextLine();
		while(ip.length()<=7) {
			System.out.print("Insira o IP do servidor: ");
			ip = input.nextLine();	
		}
		System.out.print("Insira o tempo de resposta: ");
		int tempo = input.nextInt();
		while(tempo<=0) {
			System.out.print("Insira o tempo de resposta: ");
			tempo = input.nextInt();
		}
		Servidor servidor = new Servidor(ip, tempo);
		input.close();
		servidor.setAtivo(LocalTime.now());
		servidor.setPrimeiraVerificacao(LocalTime.now());
		for(int x = 1; x>0; x++) {
			try {
				if (!InetAddress.getByName(servidor.getIp()).isReachable(servidor.getTempo())) {
					servidor.setContadorParadas();
					servidor.saida(x);
				}else {
					servidor.setAtivo(LocalTime.now());
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro no Try");
			}
		}
		
	}

}
