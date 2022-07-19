package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a base");
		int base = scanner.nextInt();

		System.out.println("Digite o expoente");
		int potencia = scanner.nextInt();
		int resultado=base;
				
		for (int i = 1; i < potencia; i++) {
			resultado *= base;
  		   }
		System.out.println("Soma de todos é: "+resultado);
	 }
	}

