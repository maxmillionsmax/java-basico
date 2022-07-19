package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite a primeira nota ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota ");
		double nota2 = scan.nextDouble();
		double mediaNotas = (nota1 + nota2)/2;
		
		if (mediaNotas >=7 && mediaNotas!=10) {
			System.out.println("Aprovado");
		}else if (mediaNotas == 10) {
			System.out.println("Aprovado com distinção");			
		}else{
			System.out.println("Reprovado");
		
		}
		
	  }
	}


