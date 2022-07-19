package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com numeros para tabuada:");
			vetorA[i] = scanner.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de "+vetorA[i]);
			for (int j = 1; j <=10 ; j++) {
				System.out.println(j+" x "+ vetorA[i]+" = "+(vetorA[i]*i));
			}
			System.out.println();
		}	
		
		}

}
