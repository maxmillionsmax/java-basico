package com.maximiliano.cursojava.aula19.labs;

public class Exer04 {

	public static void main(String[] args) {

		int[] vetorA = new int[15];
		vetorA[0] = 225;
		vetorA[1] = 196;
		vetorA[2] = 169;
		vetorA[3] = 144;
		vetorA[4] = 121;
		vetorA[5] = 100;
		vetorA[6] = 81;
		vetorA[7] = 64;
		vetorA[8] = 49;
		vetorA[9] = 36;
		vetorA[10] = 25;
		vetorA[11] = 16;
		vetorA[12] = 9;
		vetorA[13] = 4;
		vetorA[14] = 1;
		
						
		int vetorB[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			   vetorB[i] = (int) Math.sqrt(vetorA[i]);
			   System.out.print(" " +vetorB[i]+" "); 
		}

	}

}
