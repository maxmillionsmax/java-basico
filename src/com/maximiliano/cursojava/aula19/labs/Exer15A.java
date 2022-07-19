package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
		double percentualImpar = 0;
		double percentualPar = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impar++;
			}
		  }
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		int par = vetorA.length - impar;
		percentualPar = (par*100)/vetorA.length;
		percentualImpar = 100 - percentualPar;
		
		System.out.println();
		System.out.println("Percentual de vetores pares é "+percentualPar+"%");
		System.out.println("Percentual de vetores impares é "+percentualImpar+"%");
				 
	}
	
}

