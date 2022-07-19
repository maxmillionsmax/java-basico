package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um fatorial");
		int numero = scanner.nextInt();
		
		System.out.println("Fatorial de "+numero);
		
		System.out.print(numero + "! = ");
		
		int fatorial = 1;
		
		for (int i = numero; i > 1; i--) {
			fatorial*=i;
			System.out.print(i+" . ");
		}
		System.out.println(" 1 = "+fatorial);
	 }
	}


