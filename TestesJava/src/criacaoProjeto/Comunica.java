package criacaoProjeto;

public class Comunica {
	
	private static Comunica com;
	
	private int codigo;
	private String msg;
	private boolean tipo;
	
	private Comunica() {
		
	}
	
	public static Comunica getCom() {
		return com;
	}
	
	public static void setCom(Comunica com) {
		Comunica.com = com;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public static Comunica getInstance() {
		if (com == null)
			com = new Comunica();
		return com;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comunica [codigo=");
		builder.append(codigo);
		builder.append(", msg=");
		builder.append(msg);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
}
