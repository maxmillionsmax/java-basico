package com.maximiliano.cursojava.aula19.labs;

public class Exer11 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int cont = 0;
		
		vetorA[0] = 1;
		vetorA[1] = 5;
		vetorA[2] = 6;
		vetorA[3] = 2;
		vetorA[4] = 5;
		vetorA[5] = 1;
		vetorA[6] = 3;
		vetorA[7] = 3;
		vetorA[8] = 9;
		vetorA[9] = 1;	
						
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				System.out.println(vetorA[i]);
			cont++;	
			}
		}
		System.out.println("O vetorA tem  "+ cont +" pares");

	}

}
