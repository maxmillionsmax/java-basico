package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Digite o lado do quadrado: ");
		
		double ladoQuadrado = scan.nextDouble();
		
		double area = ladoQuadrado*ladoQuadrado;
		
		double areaMath = Math.pow(ladoQuadrado, 2);
				
		System.out.println("A area do circulo com raio "+ladoQuadrado+" é de "+area);
		
		System.out.println();
		
		System.out.println("A area usando Math, no circulo com raio "+ladoQuadrado+" é de "+areaMath);
		
		System.out.println();
		
		System.out.println("O dobro da area do quadrado é: "+(area*2));
		
	}

}
