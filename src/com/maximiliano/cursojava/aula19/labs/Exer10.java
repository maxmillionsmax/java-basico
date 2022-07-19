package com.maximiliano.cursojava.aula19.labs;

public class Exer10 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		vetorA[0] = 100;
		vetorA[1] = 25;
		vetorA[2] = 366;
		vetorA[3] = 422;
		vetorA[4] = 55;
		vetorA[5] = 688;
		vetorA[6] = 777;
		vetorA[7] = 88;
		vetorA[8] = 90;
		vetorA[9] = 10;	
						
		for (int i = 0; i < vetorA.length; i++) {
			 vetorB[i] = vetorA[i] % 2;
			System.out.println("B["+i+"] = "+vetorB[i]);
			
		}

	}

}
