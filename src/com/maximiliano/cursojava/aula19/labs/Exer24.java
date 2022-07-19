package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int[] vetorA = new int[10];
	
	
	for (int i = 0; i < vetorA.length; i++) {
		System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
		vetorA[i] = scanner.nextInt();
	 }
	boolean palindromo = true;
	for (int i = 0; i < (vetorA.length)/2; i++) {
		if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
			palindromo =false;
			break;
		}
	}
	
	System.out.print("Vetor = ");
	for (int i = 0; i < vetorA.length; i++) {
		System.out.print(vetorA[i] + "  ");
	}
	System.out.println();
		if (palindromo) {
			System.out.println("Palindromo!");
		}else {
			System.out.println("Não é palidromo!");
		}
	}
}

