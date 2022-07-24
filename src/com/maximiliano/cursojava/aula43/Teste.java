package com.maximiliano.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setCurso("Ciencia");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		Aluno aluno1 = new Aluno();
		aluno1.setCurso("Ciencia");
		double[] notas2 = {8,9,8,7};
		aluno1.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno1));
		
		String s1 = "12345687";
		String s2 = "2345687";

		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
	}
}
