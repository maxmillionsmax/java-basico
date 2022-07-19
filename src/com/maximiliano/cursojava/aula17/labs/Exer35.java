package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre numero n para serie:");
		int serie = scanner.nextInt();
		double soma = 0;
		
		for (int i = 1, j = 1;i <= serie; i++,j+=2) {
			System.out.print(" + " + i +"/"+j);
			soma+=i/j;
		}
		System.out.println(" \nA Soma = " + soma);

	}

}
