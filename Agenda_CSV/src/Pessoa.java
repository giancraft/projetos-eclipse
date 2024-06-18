public class Pessoa {
	private int codigo ;
	private String nome ;
	public int getCodigo () {
		return codigo ;
	}
	public void setCodigo ( int codigo ) {
		this . codigo = codigo ;
	}
	public String getNome () {

		return nome ;
	}
	public void setNome ( String nome ) {

		this . nome = nome ;
	}
	@Override
	public String toString () {

		StringBuilder builder = new StringBuilder ();

		builder . append ( " Pessoa [ codigo = " );

		builder . append ( codigo );

		builder . append ( " , nome = " );

		builder . append ( nome );

		builder . append ( " ] " );

		return builder . toString ();
	}
}