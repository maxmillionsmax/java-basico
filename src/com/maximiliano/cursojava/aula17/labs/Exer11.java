package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int numero1 = scanner.nextInt();

		System.out.println("Digite o segundo numero");
		int numero2 = scanner.nextInt();
		int soma=0;
				
		for (int i = numero1; i <= numero2; i++) {
			soma+=i;
			System.out.println(i);
  		   }
		System.out.println("Soma de todos é: "+soma);
	 }
	}

