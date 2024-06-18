package exemplosSingleton;

//Exemplo: centralizando o acesso das configuracoes globais de um aplicativo

public class ConfigApp {
	private static ConfigApp config;
	
	private String idioma;
	private String autenticacao;
	private Boolean visibilidadeAtividades;
	
	private ConfigApp(){
		
	}
	
	public static ConfigApp getConfig() {
		return config;
	}
	public static void setConfig(ConfigApp config) {
		ConfigApp.config = config;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getAutenticacao() {
		return autenticacao;
	}
	public void setAutenticacao(String autenticacao) {
		this.autenticacao = autenticacao;
	}
	public Boolean getVisibilidadeAtividades() {
		return visibilidadeAtividades;
	}
	public void setVisibilidadeAtividades(Boolean visibilidadeAtividades) {
		this.visibilidadeAtividades = visibilidadeAtividades;
	}

	public static ConfigApp getInstance() {
		if (config == null) 
			config = new ConfigApp();
		return config;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConfigApp [idioma=");
		builder.append(idioma);
		builder.append(", autenticacao=");
		builder.append(autenticacao);
		builder.append(", visibilidadeAtividades=");
		builder.append(visibilidadeAtividades);
		builder.append("]");
		return builder.toString();
	}	
}
