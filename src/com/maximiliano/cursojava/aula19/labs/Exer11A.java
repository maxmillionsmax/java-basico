package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer11A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[8];
		int qtdPares = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		    for (int i = 0; i < vetorA.length; i++) {
			   if(vetorA[i]%2 == 0) {
				   qtdPares++;
			    }
			}
		    System.out.print("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i]+ " ");
			    }
			System.out.println();
		    System.out.println("O vetorA tem "+ qtdPares +" pares");
		}
}
