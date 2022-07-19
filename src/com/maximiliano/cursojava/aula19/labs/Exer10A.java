package com.maximiliano.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[4];
		int[] vetorB = new int[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
			vetorB[i] = vetorA[i]%2;
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
	}
}
