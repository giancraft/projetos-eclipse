package fluenteInterface;

public class Jedi {
	private String nome;
	private String corSabre;
	private String planetaNatal;
	
	public Jedi nascidoEm(String planetaNatal) {
		this.planetaNatal = planetaNatal;
		return this;
	}
	public Jedi deNome(String nome) {
		this.nome = nome;
		return this;
	}
	public Jedi usaSabre(String corSabre) {
		this.corSabre = corSabre;
		return this;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorSabre() {
		return corSabre;
	}
	public void setCorSabre(String corSabre) {
		this.corSabre = corSabre;
	}
	public String getPlanetaNatal() {
		return planetaNatal;
	}
	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jedi [nome=");
		builder.append(nome);
		builder.append(", corSabre=");
		builder.append(corSabre);
		builder.append(", planetaNatal=");
		builder.append(planetaNatal);
		builder.append("]");
		return builder.toString();
	}
}
