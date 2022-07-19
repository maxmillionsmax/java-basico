package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com valores da " +(i+1)+"ª idade");
			idades[i] = scanner.nextInt();
		    }
		
		int maior = idades[0];
		int menor = idades[0];
		
		int indexMaior = 0;
		int indexMenor = 0;
		
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			}else if(idades[i] < menor) {
				menor = idades[i];
				indexMenor = i;
			}
		  }
		System.out.print("As idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + "  ");
		}
		System.out.println();

		System.out.println("A menor idade é =  "+menor);

		System.out.println("Indice menor idade: "+indexMenor);
		
		System.out.println("A maior idade é =  "+maior);

		System.out.println("Indice maior idade: "+indexMaior);
					 
	}
	
}

