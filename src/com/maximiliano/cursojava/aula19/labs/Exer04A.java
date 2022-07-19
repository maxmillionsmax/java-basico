package com.maximiliano.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[5];
		double[] vetorB = new double[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição :" + i);
			vetorA[i] = scanner.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
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
	}
}
