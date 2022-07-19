package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Digite o primeiro nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Digite o segundo nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Digite o terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite o quarta nota: ");
		double nota4 = scan.nextDouble();
		
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A Media dessas notas é: "+ media);
	}

}
