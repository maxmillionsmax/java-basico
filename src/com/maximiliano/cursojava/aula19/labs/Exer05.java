package com.maximiliano.cursojava.aula19.labs;

public class Exer05 {

	public static void main(String[] args) {

		int[] vetorA = new int[5];
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
								
		int vetorB[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			   vetorB[i] = vetorA[i] * i;
			   System.out.print(" " +vetorB[i]+" "); 
		}

	}

}
