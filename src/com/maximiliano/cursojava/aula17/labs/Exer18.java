package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");

		int numero = scanner.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0 ) {
				System.out.println("Esse numero não é primo, divisivel por "+i);
				primo = false;
			}
		}
		if (primo) {
			System.out.println("É primo!");
		}
	 }
	}


