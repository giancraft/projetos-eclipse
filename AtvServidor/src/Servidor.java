import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Servidor {
	
	private String ip;
	private int tempo;
	private String email="teste";
	private String nome = "teste";
	private LocalTime primeiraVerificacao;
	private int contadorParadas = 0;
	private LocalTime ativo;
	private int tempoAtividade=0;
	public void saida(int x) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime atual = LocalTime.now();
		System.out.println("Ocorrência: " + x + " - " + LocalDate.now() + " " + atual.format(formatador));
		System.out.println("Nome: " + this.getNome() + " - responsável: " + this.getEmail() + " - " + this.getIp());
		System.out.println("Última verificação ativa: " + getAtivo().format(formatador));
		System.out.println("Primeira verificação inatividade: " + this.getPrimeiraVerificacao().format(formatador));
		Duration duration = Duration.between(this.getPrimeiraVerificacao(), this.getAtivo());
		long val = duration.getSeconds();
		System.out.println("Tempo em atividade: "+duration.getSeconds());
		duration = Duration.between(this.getPrimeiraVerificacao(), LocalDateTime.now());
		System.out.println("Tempo em inatividade: "+(int)(duration.getSeconds()-(int)val));
	}
	public int getTempoAtividade() {
		return tempoAtividade;
	}
	public void setTempoAtividade(int tempoAtividade) {
		this.tempoAtividade = tempoAtividade;
	}
	public Servidor(String ip, int tempo) {
		this.setIp(ip);
		this.setTempo(tempo);
		this.setPrimeiraVerificacao(LocalTime.now());
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getTempo() {
		return tempo*1000;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalTime getPrimeiraVerificacao() {
		return primeiraVerificacao;
	}
	public void setPrimeiraVerificacao(LocalTime primeiraVerificacao) {
		this.primeiraVerificacao = primeiraVerificacao;
	}
	public int getContadorParadas() {
		return contadorParadas;
	}
	public void setContadorParadas() {
		this.contadorParadas+=1;
	}
	public LocalTime getAtivo() {
		return ativo;
	}
	public void setAtivo(LocalTime ativo) {
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
