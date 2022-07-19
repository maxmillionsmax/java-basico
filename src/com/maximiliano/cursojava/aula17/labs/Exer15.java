package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite n-esimo termo para sequendia fibonate");
		int sequenciaFibonate = scanner.nextInt();
		int primeiro =1;
		int segundo = 1;
		int proximo;

		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i = 0; i < sequenciaFibonate; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
			
		}
		/*while(i<sequenciaFibonate) {
			num = numA +numB;
			numB=numA;
			numA = num;
			i++;
			System.out.println("Sequencia fibonnaci = "+numA);
			
		}*/
		//Outra forma
		
	 }
	}

