package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o elemento na posição "+i);
			vetorA[i] = scanner.nextInt();
		}
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o número "+vetorA[i]);
			for(int j = 1; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j+" é Divisor");
				}
			}
			System.out.println();
		}
	}
}
