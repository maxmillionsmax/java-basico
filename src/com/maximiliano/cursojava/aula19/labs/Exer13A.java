package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer13A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma+=vetorA[i];
 			}
		  }
			System.out.println();
			System.out.print("Vector A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i]+" ");
			}
			System.out.println();
			System.out.println("O resultado da soma dos vetores divisiveis por 5 é "+soma);
		    }
		}

