package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite n-esimo termo para sequendia fibonate");
		int sequenciaFibonate = scanner.nextInt();
		int primeiro =1;
		int segundo = 1;
		int proximo = 0;

		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo < 500) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
			
		}
	 }
	}


