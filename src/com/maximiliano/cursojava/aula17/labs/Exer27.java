package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a quantidade de temperaturas: ");
		int quantidadeTemperaturas =  scanner.nextInt();
		double temperatura;
		double maiorTemperatura = Double.MIN_VALUE;
		double menorTemperatura = Double.MAX_VALUE;
		double somaTemperatura = 0;
		
		
			for (int i = 1; i <= quantidadeTemperaturas; i++) {
			System.out.println("Entre a "+i+"ª temperatura");
				temperatura = scanner.nextDouble();
				somaTemperatura+=temperatura;
				
				if (temperatura > maiorTemperatura) {
					maiorTemperatura = temperatura;
				}
				if (temperatura < menorTemperatura) {
					menorTemperatura = temperatura;
				}
			}
			double media = somaTemperatura/quantidadeTemperaturas;

			System.out.println("O valor medio das temperaturas é "+media);
			
			System.out.println("A Menor temperatura é: "+menorTemperatura);

			System.out.println("A Maior temperatura é: "+maiorTemperatura);
	  }
	}


