package com.maximiliano.cursojava.aula19.labs;

public class Exer14 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int soma = 0;
		double media = 0;

		vetorA[0] = 2;
		vetorA[1] = 2;
		vetorA[2] = 2;
		vetorA[3] = 2;
		vetorA[4] = 2;
		vetorA[5] = 2;
		vetorA[6] = 2;
		vetorA[7] = 2;
		vetorA[8] = 2;
		vetorA[9] = 2;	
						
		for (int i = 0; i < vetorA.length; i++) {
			soma+=vetorA[i];
 			}
   	    media = soma/vetorA.length;
		System.out.println();
		System.out.print("Vector A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		System.out.println("A media dos vetores é "+media);
		}

}
