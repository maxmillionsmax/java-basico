package com.maximiliano.cursojava.aula20;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 6.3;
		notasAlunos[1][3] = 4;

		notasAlunos[2][0] = 1;
		notasAlunos[2][1] = 4.9;
		notasAlunos[2][2] = 2.1;
		notasAlunos[2][3] = 3.3;
		
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]+" - ");
			}
			System.out.println();
		}
		System.out.println();
		notasAlunos[1][3] = 8;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]+" - ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Calculando a media de cada aluno");
		System.out.println();

		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma+= notasAlunos[i][j];
			}
			System.out.println("A media do aluno "+i+" é "+soma/4);
		}
		System.out.println();

		//-----------------------------------------------------
		//-----------------------------------------------------
		//-----------------------------------------------------
		//-----------------------------------------------------

		System.out.println("Notas de alunos 2");
		double[] notaAluno1 = {7,8,9,10};
		double[][] notaAluno2 = {{10,12,20,30},{8,6,7,10}};
		for (int i = 0; i < notaAluno2.length; i++) {
			for (int j = 0; j < notaAluno2[i].length; j++) {
				System.out.println("Turma 2,  "+(i+1)+"º Aluno, nota =  "+notaAluno2[i][j]);
			}
		}
	}
}
