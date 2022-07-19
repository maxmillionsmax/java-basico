package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
			System.out.println("Entre com valores da posição vetor B: posição [" + i+"]");
			vetorB[i] = scanner.nextInt();
		 }
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] =  1;
			}else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}else {
				vetorC[i] = 0;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + "  ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + "  ");
		}
		}
	
}
