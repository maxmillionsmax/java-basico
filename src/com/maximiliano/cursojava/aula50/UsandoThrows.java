package com.maximiliano.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args){
		
		System.out.println("Entre com um numero decimal:");
		try {
			double numero = lerNumero();
			System.out.println("Voce digitou "+numero);
		} catch (Exception e) {
			System.out.println("Entrada invalida!");
			e.printStackTrace();
		}
	}

	public static double lerNumero() throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextDouble();
		
		return numero;
	}
}
