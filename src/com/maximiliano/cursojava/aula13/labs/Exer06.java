package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Digite o raio do circulo: ");
		
		double raio = scan.nextDouble();
		
		double area = raio*raio*3.1415;
		
		double areaMath = Math.PI * Math.pow(raio, 2);
				
		System.out.println("A area do circulo com raio "+raio+" é de "+area);
		
		System.out.println("A area usando Math, no circulo com raio "+raio+" é de "+areaMath);
		
	}

}
