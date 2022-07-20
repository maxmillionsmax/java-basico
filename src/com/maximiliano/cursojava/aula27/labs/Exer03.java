package com.maximiliano.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome=scanner.next();
		
		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso=scanner.next();
		
		System.out.println("Entre com a matricula do aluno");
		aluno.matricula=scanner.next();
		
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.print("Entre com o nome da disciplina "+(i+1)+"ª ->");
			aluno.nomeDisciplinas[i]=scanner.next();
		}
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina "+ aluno.nomeDisciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.print("Entre com a nota "+(j+1)+"-> ");
				aluno.notasDisciplinas[i][j] = scanner.nextDouble();
			}
		}
		aluno.mostraInfo();
		
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" - Foi aprovado com media de "+aluno.obterMedia(i));
			}else {
				System.out.println("Disciplina "+aluno.nomeDisciplinas[i]+" - Foi reprovado com media de "+aluno.obterMedia(i));
			}
		}
	}

}
