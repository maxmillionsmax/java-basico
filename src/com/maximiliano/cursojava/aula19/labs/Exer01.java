package com.maximiliano.cursojava.aula19.labs;

public class Exer01 {

	public static void main(String[] args) {

		int A[] = new int[5];
		
		A[0] = 6;
		A[1] = 3;
		A[2] = 4;
		A[3] = 5;
		A[4] = 12;
		
		int B[] = new int[5];
		
		for (int i = 0; i < A.length; i++) {
			   B[i] = A[i];
			 System.out.print(B[i]+" ");  
		}

	}

}
