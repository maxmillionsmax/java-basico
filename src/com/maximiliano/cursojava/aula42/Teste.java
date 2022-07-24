package com.maximiliano.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa(); 
		
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG = "Outro nome";
		System.out.println(Constantes.URL_BLOG);
		System.out.println(Constantes.CURSO_MAXIMILIANO);
		//Constantes.CURSO_MAXIMILIANO = "Alteração";
		
	}

}
