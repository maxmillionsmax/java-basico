package com.maximiliano.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[] vetorA = new double[4];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextDouble();
			System.out.println("Entre com valores da posição vetor B: posição [" + i+"]");
			vetorB[i] = scanner.nextDouble();
			vetorC[i] = vetorA[i] / vetorB[i];
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
		
		DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
		System.out.print("Vetor c = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(decimalFormat.format(vetorC[i]) + "  ");
		}
	}
}
