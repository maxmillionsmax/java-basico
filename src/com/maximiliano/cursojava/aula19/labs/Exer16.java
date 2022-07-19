package com.maximiliano.cursojava.aula19.labs;

public class Exer16 {

	public static void main(String[] args) {

		int[] vetorA = new int[10];
        double media;
		int abaixo15 =0,Vetor15 = 0,acima15 = 0;
		int soma = 0;
		
		vetorA[0] = 70;
		vetorA[1] = 20;
		vetorA[2] = 15;
		vetorA[3] = 2;
		vetorA[4] = 15;
		vetorA[5] = 5;
		vetorA[6] = 2;
		vetorA[7] = 2;
		vetorA[8] = 15;
		vetorA[9] = 3;	
						
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i]==15) {
				Vetor15++;
			}else if (vetorA[i] > 15) {
				acima15++;
				soma+=vetorA[i];
			}else if(vetorA[i] < 15){
				abaixo15++;
			}
		  }
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();
		media = soma/acima15;
		System.out.println("A quantidade de elementos menores que 15 são "+abaixo15);
		System.out.println("A quantidade de elementos 15 são "+Vetor15);
		System.out.println("A quantidade de elementos acima que 15 são = "+acima15);
		System.out.println("A media de elementos maiores que 15 = "+media);
	}

}
