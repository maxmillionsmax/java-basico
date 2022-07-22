package com.maximiliano.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Entre com um numero positivo");
			num = scanner.nextInt();
			if (num<0) {
				System.out.println("Numero inválido, entre novamente");
			}
		} while (num < 0);
		
		System.out.println("O Fatorial "+num+"! = "+Calculadora.fatorial(num));
		
		
	}

}
