package Pessoa;
public class PessoaFisica extends Pessoa {

		private String cpf;
		private String estadoCivil;
		
		public PessoaFisica(String nome) {
		super(nome);
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("PessoaFisica [cpf=");
			builder.append(cpf);
			builder.append(", estadoCivil=");
			builder.append(estadoCivil);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}

		
		
}
