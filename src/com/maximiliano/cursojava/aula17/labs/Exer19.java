package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite quantidade de notas: ");

		double notas = scanner.nextDouble();
		int soma = 0;
		double media;
		double nota;

		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota: "+(i+1)+"ª");
			nota = scanner.nextDouble();
			
			soma+=nota;
		}
		media = soma / notas;
		System.out.println("Soma = "+soma);
		System.out.println("Media = "+media);
	 }
	}


