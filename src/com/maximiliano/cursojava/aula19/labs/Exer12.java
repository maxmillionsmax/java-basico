package com.maximiliano.cursojava.aula19.labs;

public class Exer12 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int soma = 0;
		
		vetorA[0] = 1;
		vetorA[1] = 1;
		vetorA[2] = 1;
		vetorA[3] = 1;
		vetorA[4] = 1;
		vetorA[5] = 1;
		vetorA[6] = 1;
		vetorA[7] = 1;
		vetorA[8] = 1;
		vetorA[9] = 1;	
						
		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
			}
		System.out.println("A soma de todos os vetores deu "+soma);
		}

}
