package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a quantidade de turmas: ");
		int turmas =  scanner.nextInt();
		int Alunos = 0;
		int soma = 0;
		boolean invalido = true;
					
			for (int i = 1; i <= turmas; i++) {
				invalido = true;
				do {
					System.out.println("Entre com a quantidade de alunos na "+i+"ª turma");
					Alunos = scanner.nextInt();
					if (Alunos <= 40) {
						invalido = false;					
					}else {
						System.out.println("numero de alunos deve ser max 40");
					}
					
				} while (invalido);
				soma+=Alunos;
			}
			double media = soma/turmas;
			System.out.println("O numero medio de alunos por turma é "+media);
	  }
	}


