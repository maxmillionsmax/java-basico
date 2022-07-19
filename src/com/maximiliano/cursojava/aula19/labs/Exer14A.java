package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		double media = 0.0;
		int impar = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				soma+=vetorA[i];
				impar++;
			}
		  }
		
		 media = soma/impar;
		
		 System.out.println();
		
		 System.out.print("Vector A = ");
		
		 for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i]+" ");
		}
		
		 System.out.println();
		
		 System.out.println("A soma dos impares é: "+soma);
		 System.out.println("A media dos vetores impares é: "+media);

	}
	
}

