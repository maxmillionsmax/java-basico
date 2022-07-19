/*
 * Arrays Irregulares
 * int[][] arrayIrregular = new int[3][];
 * arrayIrregular[0] = new int[1]
 * arrayIrregular[1] = new int[2]
 * arrayIrregular[2] = new int[3]
 */
package com.maximiliano.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com numero de pessoas quer serão entrevistadas:");
		int numEntrevitados = scanner.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevitados][];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			
			System.out.println("Quantos filhos ?");
			int qtdFilhos = scanner.nextInt();
					
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho "+(j+1));
				nomesFilhos[i][j] = scanner.next();
			}
		}
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa "+i+" tem "+ nomesFilhos[i].length + " filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
