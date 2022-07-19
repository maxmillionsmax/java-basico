package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		int numero2 = scanner.nextInt();
				
		for (int i = numero1+1; i < numero2; i++) {
			System.out.println(i);
		}
	 }
	}

