package com.maximiliano.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer08A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posi��o vetor A: posi��o [" + i+"]");
			vetorA[i] = scanner.nextInt();
			System.out.println("Entre com valores da posi��o vetor B: posi��o [" + i+"]");
			vetorB[i] = scanner.nextInt();
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		
		System.out.println();
		DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(decimalFormat.format(vetorB[i]) + "  ");
		}
		System.out.println();
		
		System.out.print("Vetor c = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + "  ");
		}
	}
}
