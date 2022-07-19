package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[8];
		int soma = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		    }
		System.out.println();
	    System.out.println("A soma de todos os elementos do vetorA = "+ soma );
	}
}
