package com.maximiliano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[][] numeros = new int[3][3]; 
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
			System.out.println("Entre com valor da posição ["+i+" , "+j+"]");
			numeros[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
			System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] % 2 != 0) {
					qtdImpares++;
				}else {
					qtdPares++;
				}
			}	
				
		}
		System.out.println();

		System.out.println("Quantidade de numeros pares -> "+qtdPares);
		System.out.println("Quantidade de numeros impares -> "+qtdImpares);
		
	}

}
