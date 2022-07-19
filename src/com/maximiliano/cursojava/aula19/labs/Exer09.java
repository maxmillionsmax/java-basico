package com.maximiliano.cursojava.aula19.labs;

public class Exer09 {

	public static void main(String[] args) {

		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[vetorA.length];
		
		vetorA[0] = 10;
		vetorA[1] = 20;
		vetorA[2] = 30;
		vetorA[3] = 40;
		vetorA[4] = 50;
		vetorA[5] = 60;
		vetorA[6] = 70;
		vetorA[7] = 80;
		vetorA[8] = 90;
		vetorA[9] = 100;	
		
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
			  vetorC[i] = vetorA[i] / vetorB[i];
			   System.out.println("C["+i+"] = " +vetorC[i]+" "); 
		}

	}

}
