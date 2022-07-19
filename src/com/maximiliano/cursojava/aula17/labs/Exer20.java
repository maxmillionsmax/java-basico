package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a quantidade de idades: ");
		int idades =  scanner.nextInt();
		int idade;
		int soma = 0;
		
		for (int i = 0; i < idades; i++) {
			System.out.println("Entre com a "+(i+1)+"ª idade");
			idade = scanner.nextInt();
			soma+=idade;
		}
		double media = soma/idades;
		
		System.out.println("A media de idade é "+media);
		
		if (media>=0 && media <=25) {
			System.out.println("Jovem");
		}else if (media>=26 && media <=60) {
			System.out.println("adulta");
		}else if (media > 60) {
			System.out.println("Idoso");
		}
	 }
	}


