package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int qtd0 = 0;
			int qtd1= 0;
			

			for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = (int) Math.round(Math.random() * 1);
				if (vetorA[i] == 0) {
					qtd0++;
				}else {
					qtd1++;
				}
			}
			double porc0 = (qtd0 * 100)/vetorA.length;
			double porc1 = (qtd1 * 100)/vetorA.length;
			
			
			System.out.println("Quando Vetor A = 0 ");
			System.out.print("Percentual de zeros: "+porc0+"%");
			System.out.println();
			System.out.println("Quando Vetor A = 1 ");
			System.out.print("Percentual de Uns: "+porc1+"%");
	
}
}