package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite para obter numeros primos no intervalo de 1 até :");

		int numero = scanner.nextInt();
		boolean primo;
		
		for (int i = 1; i <= numero; i++) {
			primo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0 ) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
	        }
       }
 }
}


