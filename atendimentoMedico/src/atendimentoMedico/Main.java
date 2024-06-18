package atendimentoMedico;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Paciente pac1 = new Paciente("Rodrigo Curvello", "24/04/1978", "08h00", "11h15", 0);
		
		Paciente pac2 = new Paciente("Gianluca", "19/10/2004", "13h15", "17h15", 0);
		
		Paciente pac3 = new Paciente("Mikhael Línnyker", "08/05/1997", "11h00", "15h00", 0);
		
		System.out.println("O paciente está numa situação grave?"); // Vale 5 pontos
		pac1.setPrioridade(pac1.getPrioridade() + 5);
		pac2.setPrioridade(pac2.getPrioridade() + 0);
		pac3.setPrioridade(pac3.getPrioridade() + 0);
		
		System.out.println("O paciente possui alguma doença que possa agravar a situação?"); // Vale 4 pontos
		pac1.setPrioridade(pac1.getPrioridade() + 0);
		pac2.setPrioridade(pac2.getPrioridade() + 0);
		pac3.setPrioridade(pac3.getPrioridade() + 4);
		
		System.out.println("O paciente se enquadra em um grupo prioritário?"); // Vale 3 pontos
		pac1.setPrioridade(pac1.getPrioridade() + 0);
		pac2.setPrioridade(pac2.getPrioridade() + 0);
		pac3.setPrioridade(pac3.getPrioridade() + 0);
		
		System.out.println("O paciente é uma criança ou adolescente?"); // Vale 2 pontos
		pac1.setPrioridade(pac1.getPrioridade() + 0);
		pac2.setPrioridade(pac2.getPrioridade() + 2);
		pac3.setPrioridade(pac3.getPrioridade() + 0);
		
		System.out.println("O paciente é morador da cidade?"); // Vale 1 ponto
		pac1.setPrioridade(pac1.getPrioridade() + 0);
		pac2.setPrioridade(pac2.getPrioridade() + 1);
		pac3.setPrioridade(pac3.getPrioridade() + 0);
		
		Especialidade esp = new Especialidade("Psiquiatra");
		
		ArrayList<Especialidade> especialidades = new ArrayList<Especialidade>();
		especialidades.add(esp);
		
		Medico med1 = new Medico("Ana Luíza", "03/04/2004", especialidades);
		
		Medico med2 = new Medico("Matheus Henrique", "30/06/2004");
		
		Atestado ates = new Atestado("Relato de conseguir mover objetos com a mente");
		
		Atendimento at1 = new Atendimento("03/10/1911", "8h05", "11h00", ates, pac1, med1);
		System.out.println(at1.emitirAtestado());
		
		Atendimento at2 = new Atendimento("03/10/1911", "15h30", "15h45", pac2, med2);
		
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(pac1);
		pacientes.add(pac2);
		pacientes.add(pac3);
		
		ListaAtendimento lista = new ListaAtendimento(pacientes);
		lista.ordenaLista();
		System.out.println(lista);
		
	}

}
