package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			double[] vetorA = new double[20];
			double cotacao;
			
			System.out.println("Entre com a cota��o do dolar:");
			cotacao = scanner.nextDouble();

			for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = cotacao * (i+1);
			}
			System.out.print("Vetor = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + "  ");
			}
	
}
}