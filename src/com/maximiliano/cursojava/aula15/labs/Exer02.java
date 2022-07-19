package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		if (num1 < 0) {
			System.out.println("numero é negativo: "+num1);
		}else {
			System.out.println("numero é positivo: "+num1);
		}
		
	}

}
