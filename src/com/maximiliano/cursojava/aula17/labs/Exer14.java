package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int contadorp = 0;
		int contadori = 0;
		for (int i = 1; i <11; i++) {
			System.out.println("Digite o "+i+"º numero");
			int numero = scanner.nextInt();
			if (numero%2==0) {
				contadorp++;
			}else {
				contadori++;
			}
		}
		System.out.println("Temos "+contadorp+" pares");
		System.out.println("Temos "+contadori+" impares");
	 }
	}

