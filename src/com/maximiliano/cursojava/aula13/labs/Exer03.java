package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Digite o primeiro numero: ");
		int numero_1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		int numero_2 = scan.nextInt();
		
		int soma = numero_1 + numero_2;
		
		System.out.println("A soma desses numero é: "+ soma);
	}

}
