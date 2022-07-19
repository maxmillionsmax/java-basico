package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um fatorial");
		int numero = scanner.nextInt();
		
		int fatorial = 1;
		
		for (int i = numero; i > 0; i--) {
			fatorial*=i;
			System.out.println(i);
		}
		System.out.println("O Fatorial: "+fatorial);
	 }
	}


