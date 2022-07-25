package com.maximiliano.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor= new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		if (aluno instanceof Aluno) {
			System.out.println("É do tipo Aluno");
		}
		if (professor instanceof Professor) {
			System.out.println("É do tipo Pessoa");
		}
	}
}
