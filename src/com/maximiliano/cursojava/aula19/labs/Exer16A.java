package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] vetorA = new int[10];
        double media;
		int abaixo15 =0,Vetor15 = 0,acima15 = 0;
		int somaMaior15 = 0;
		int somaMenor15 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com valores da posição vetor A: posição [" + i+"]");
			vetorA[i] = scanner.nextInt();
		    }
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i]==15) {
				Vetor15++;
			}else if (vetorA[i] > 15) {
				acima15++;
				somaMaior15+=vetorA[i];
			}else if(vetorA[i] < 15){
				abaixo15++;
				somaMenor15+=vetorA[i];
			}
		  }
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "  ");
		}
		System.out.println();
		media = somaMaior15/acima15;
		System.out.println("A quantidade de elementos menores que 15 são "+abaixo15+" e somados dão = "+somaMenor15);
		System.out.println("A quantidade de elementos 15 são "+Vetor15);
		System.out.println("A quantidade de elementos acima que 15 são = "+acima15+" e somados dão = "+somaMaior15);
		System.out.println("A media de elementos maiores que 15 = "+media);
		
		
				 
	}
	
}

