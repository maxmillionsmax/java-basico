package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double CityA;
		double CityB;
		double TxA;
		double TxB;
		boolean	 valido = false;
		
		do {
			System.out.println("Digite popula��o da cidade A");
			CityA= scanner.nextDouble();
				if (CityA > 0) {
					valido = true;
				}else {
					System.out.println("Popula��o A deve ser maior que 0;");
				}
			
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Digite popula��o da cidade B");
			CityB= scanner.nextDouble();
				if (CityB > 0) {
					valido = true;
				}else {
					System.out.println("Popula��o B deve ser maior que 0;");
				}
			
		} while (!valido);
		
        valido = false;
		
		do {
			System.out.println("Digite Taxa de crescimento cidade A");
			TxA= scanner.nextDouble();
				if (TxA > 0) {
					valido = true;
				}else {
					System.out.println("Taxa de crescimento deve ser maior que 0;");
				}
			
		} while (!valido);
			
          valido = false;
		
		do {
			System.out.println("Digite Taxa de crescimento cidade B");
			TxB= scanner.nextDouble();
				if (TxB > 0) {
					valido = true;
				}else {
					System.out.println("Taxa de crescimento deve ser maior que 0;");
				}
			
		} while (!valido);
		
		int cont = 0;
		while (CityA < CityB) {
			CityA+=(CityA/100)*TxA;
			CityB+=(CityB/100)*TxB;
			cont++;
		}
		System.out.println("A popula��o A: "+CityA);
		System.out.println("A popula��o B: "+CityB);
		System.err.println("Em "+cont+ " seram iguais");
	 }

  }
