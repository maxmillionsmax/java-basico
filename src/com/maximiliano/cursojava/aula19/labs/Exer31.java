package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valor da posição de A:");
			vetorA[i] = scanner.nextInt();
		}
		
		int posB = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
		   }
		}
		for (int i = 0; i < vetorB.length; i++) {
			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		
	}

}
