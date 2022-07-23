package com.maximiliano.cursojava.aula36.labs;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public String getHorario() {
		return horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public Aluno[] getAluno() {
		return alunos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public void setAluno(Aluno[] aluno) {
		this.alunos = aluno;
	}
	public String obterInfo() {
		String info = "Nome do Curso: "+nome+"\n";
		
		if (professor !=null) {
			info += professor.obterInfo() + "\n";
		}
		if (alunos != null) {
			System.out.println("-----Alunos------");
			for (Aluno aluno : alunos) {
				if (aluno !=null) {
				info+=aluno.obterInfo()+"\n";
				}
			}
			info+="\nMedia da turma = "+obterMediaTurma();
		}
		return info;
	}
	public double obterMediaTurma() {
		double soma =0;
		for (Aluno aluno : alunos) {
			if (aluno !=null) {
				soma+=aluno.obterMedia();
			}
		}
		return soma/alunos.length;
	}
}
