package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero:");
		
		int numero = scan.nextInt();
		
		if((numero % 2 == 0) || numero == 0) {
			System.out.println("O numero "+numero+" � par");
		}else {
			System.out.println("O numero "+numero+" � impar");
		}
	}
}
