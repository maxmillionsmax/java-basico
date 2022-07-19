package com.maximiliano.cursojava.aula19.labs;

public class Exer15 {

	public static void main(String[] args) {

		int[] vetorA = new int[17];
		int soma = 0;
		double percentualImpar = 0;
		double percentualPar = 0;
		
		vetorA[0] = 7;
		vetorA[1] = 2;
		vetorA[2] = 1;
		vetorA[3] = 2;
		vetorA[4] = 1;
		vetorA[5] = 5;
		vetorA[6] = 2;
		vetorA[7] = 2;
		vetorA[8] = 1;
		vetorA[9] = 3;	
						
		for (int i = 0; i < vetorA.length; i++) {
			soma+=vetorA[i];
 			}
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impar++;
			}
		  }
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();
		int par = vetorA.length - impar;
		percentualPar = (par*100)/vetorA.length;
		System.out.println("Percentual de vetores pares é "+percentualPar+"%");
		percentualImpar = 100 - percentualPar;
		System.out.println("Percentual de vetores impares é "+percentualImpar+"%");
		}

}
