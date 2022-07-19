package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		int maisDe35 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				maisDe35++;
			}
		  }
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();

		System.out.println("A quantidade de pessoas com mais 35 são "+maisDe35);
					 
	}
	
}

