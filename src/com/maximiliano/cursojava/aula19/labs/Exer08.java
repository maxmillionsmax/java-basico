package com.maximiliano.cursojava.aula19.labs;

public class Exer08 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[vetorA.length];
		
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		vetorA[8] = 9;
		vetorA[9] = 10;	
		
		vetorB[0] = 2;
		vetorB[1] = 3;
		vetorB[2] = 4;
		vetorB[3] = 5;
		vetorB[4] = 6;
		vetorB[5] = 7;
		vetorB[6] = 8;
		vetorB[7] = 9;
		vetorB[8] = 10;
		vetorB[9] = 11;	
		
		
		for (int i = 0; i < vetorA.length; i++) {
			  vetorC[i] = vetorA[i] * vetorB[i];
			   System.out.println("C["+i+"] = " +vetorC[i]+" "); 
		}

	}

}
