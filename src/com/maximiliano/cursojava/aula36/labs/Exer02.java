package com.maximiliano.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso");
		String nome = scanner.nextLine();
		System.out.println("Entre com o horario do curso");
		String horario = scanner.nextLine();
		System.out.println("Entre com o nome do professor");
		String nomeProfessor = scanner.nextLine();
		System.out.println("Entre com o departamento do professor");
		String depProf = scanner.nextLine();
		System.out.println("Entre com o email do professor");
		String emailProf = scanner.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("------Alunos--------");
		
		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < 5; i++) {

			scanner.nextLine();
			
			System.out.println("Entre com o nome do aluno: "+(i+1));
			String nomeAluno = scanner.nextLine();
			
			System.out.println("Entre com a matricula do aluno:");
			String matAluno = scanner.nextLine();
			
			double[] notas = new double[4];
			
			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota: "+(j+1));
				notas[j] = scanner.nextDouble();
			}
			
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
			
		
		curso.setAluno(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
