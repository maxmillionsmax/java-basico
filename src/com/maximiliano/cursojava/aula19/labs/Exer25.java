package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		 }
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[i] =  1;
			}else {
				vetorB[i] = 0;
			}
		}
		System.out.print("Vetor = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + "  ");
		}
		}
	
}
