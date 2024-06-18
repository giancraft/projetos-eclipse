package sisAcademico;

import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso cur = new Curso("Ciência da Computação", "Integral", "Presencial", "8001 horas");
		
		Aluno al1 = new Aluno("Gianluca", 20230123, LocalDate.of(2004, 10, 19), cur);
		
		Aluno al2 = new Aluno("Pedro Ryan", 20238784, LocalDate.of(2005, 01, 05), cur);
		
		Aluno al3 = new Aluno("Pedro Henrique", 20237596, LocalDate.of(2005, 01, 14), cur);
		
		Aluno al4 = new Aluno("Igor", 20237456, LocalDate.of(2005, 02, 14), cur);
		
		Professor prof1 = new Professor("Rodrigo Curvello", 19773784, LocalDate.of(1978, 04, 24));
		
		Professor prof2 = new Professor("Alan Felipe", 20013475, LocalDate.of(1997, 02, 14));
		
		Avaliacao av1 = new Avaliacao("Orientação à Objetos", "prova", LocalDate.of(2023, 10, 26), prof1);
		
		Avaliacao av2 = new Avaliacao("Java Basic", "prova", LocalDate.of(2005, 03, 15), prof1);
		
		ArrayList<Aluno> alunos1 = new ArrayList<Aluno>();
		alunos1.add(al1);
		alunos1.add(al2);
		alunos1.add(al3);
		
		ArrayList<Aluno> alunos2 = new ArrayList<Aluno>();
		alunos2.add(al1);
		alunos2.add(al2);
		alunos2.add(al3);
		alunos2.add(al4);
		
		ArrayList<Professor> profs1 = new ArrayList<Professor>();
		profs1.add(prof1);
		
		ArrayList<Professor> profs2 = new ArrayList<Professor>();
		profs2.add(prof1);
		profs2.add(prof2);
		
		ArrayList<Avaliacao> avals = new ArrayList<Avaliacao>();
		avals.add(av1);
		avals.add(av2);
		
		Disciplina dis1 = new Disciplina("Programação Orientada à Objetos", "60 horas", alunos1, profs1, avals);
		
		Disciplina dis2 = new Disciplina("Historia de Star Wars e Naruto", "120 horas", alunos2, profs2);
		
		Disciplina dis3 = new Disciplina("Lógica da Programação", "60 horas");
		
		int[] presencas1 = new int[3];
		presencas1[0] = 4;
		presencas1[1] = 4;
		presencas1[2] = 4;
		
		Frequencia freq1 = new Frequencia(presencas1, LocalDate.of(2023, 10, 26), prof1, dis1);
		
		int[] presencas2 = new int[3];
		presencas2[0] = 4;
		presencas2[1] = 4;
		presencas2[2] = 4;
		
		Frequencia freq2 = new Frequencia(presencas2, LocalDate.of(2005, 03, 15), prof1, dis1);
		
		ArrayList<Disciplina> discis = new ArrayList<Disciplina>();
		discis.add(dis1);
		discis.add(dis2);
		
		Fase fase = new Fase(2, "360 horas", cur, discis);
		
		System.out.println(fase);
		System.out.println(dis3);
		System.out.println(freq1);
		System.out.println(freq2);
		
	}

}
