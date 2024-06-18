package metodo3_notificacao;

import metodo1_notificacao.Notificacao;

public class Alerta {
	
	protected Notificacao notificacao;
	
	public Alerta(Notificacao notificacao) {
		this.notificacao = notificacao;
	}
	
	public String dispararAlerta() {
		return this.notificacao.enviar();
	}
}
