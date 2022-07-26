package com.maximiliano.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];
		Random numeroRandom = new Random();
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
						numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j]+"  ");
			}
			System.out.println();
		}
		

		int maiorL5 = 0;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		int coluna =0;
		
		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
			if (numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}
		}
		System.out.println();

		System.out.println("Maior valor linha 5= "+maiorL5);
		System.out.println("Menor valor linha 5 = "+menorL5);
		
		int coluna7 = 7;
		int maiorC7 = 0;
		int menorC7 = Integer.MAX_VALUE;
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][coluna7] > maiorC7) {
				maiorC7 = numerosAleatorios[i][coluna7];
			}
			if (numerosAleatorios[i][coluna7] < menorC7) {
				menorC7 = numerosAleatorios[i][coluna7];
			}
		}
		
		System.out.println();

		System.out.println("Maior valor coluna 7 = "+maiorC7);
		System.out.println("Menor valor coluna 7 = "+menorC7);

	}

	
}
