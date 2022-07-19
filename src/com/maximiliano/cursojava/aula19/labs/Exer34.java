package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o elemento na posição "+i);
			vetorA[i] = scanner.nextInt();
		}
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o número "+vetorA[i]);
			for(int j = 2; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j+" é par");
				}
			}
			System.out.println();
		}
	}
}
