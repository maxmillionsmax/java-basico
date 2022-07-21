package com.maximiliano.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.setNome(scanner.next());
		
		System.out.println("Entre com o nome do curso");
		aluno.setNomeCurso(scanner.next());
		
		System.out.println("Entre com a matricula do aluno");
		aluno.setMatricula(scanner.next());
		
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.print("Entre com o nome da disciplina "+(i+1)+"ª ->");
			aluno.setNomeDisciplinaPosicao(i, scanner.next());
		}
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina "+ aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.print("Entre com a nota "+(j+1)+"-> ");
				aluno.setNomePosIJ(i,j,scanner.nextDouble());
			}
		}
		aluno.mostraInfo();
		
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+aluno.getNomeDisciplinas()[i]+" - Foi aprovado com media de "+aluno.obterMedia(i));
			}else {
				System.out.println("Disciplina "+aluno.getNomeDisciplinas()[i]+" - Foi reprovado com media de "+aluno.obterMedia(i));
			}
		}
	}

}
