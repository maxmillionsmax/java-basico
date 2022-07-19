package com.maximiliano.cursojava.aula19.labs;

public class Exer13 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int soma = 0;

		vetorA[0] = 9551;
		vetorA[1] = 151;
		vetorA[2] = 13;
		vetorA[3] = 1151;
		vetorA[4] = 10;
		vetorA[5] = 1001;
		vetorA[6] = 19;
		vetorA[7] = 5001;
		vetorA[8] = 35;
		vetorA[9] = 2;	
						
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma+=vetorA[i];
 			}
		}
		System.out.println();
		System.out.print("Vector A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		System.out.println();
		System.out.println("O resultado da soma dos vetores divisiveis por 5 é "+soma);
		}

}
