package fluenteInterface;

public class Jogador {
	private String nickname;
	private String gosto;
	private String plataforma;
	
	public Jogador nick(String nickname) {
		this.nickname = nickname;
		return this;
	}
	public Jogador gostaDe(String gosto) {
		this.gosto = gosto;
		return this;
	}
	public Jogador jogaEm(String plataforma) {
		this.plataforma = plataforma;
		return this;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGosto() {
		return gosto;
	}
	public void setGosto(String gosto) {
		this.gosto = gosto;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogador [nickname=");
		builder.append(nickname);
		builder.append(", gosto=");
		builder.append(gosto);
		builder.append(", plataforma=");
		builder.append(plataforma);
		builder.append("]");
		return builder.toString();
	}
}
