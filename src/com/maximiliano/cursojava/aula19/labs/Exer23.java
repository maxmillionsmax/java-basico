package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
			if (vetorA[i] % 2 !=0) {
				break;
			}
		  }
	  }
}

