package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int soma=0;
		double media;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Entre com um numero:"+i+"º");
			numero = scanner.nextInt();
			soma+=numero;
		}
		media = soma / 5;
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);
	 }
	}

