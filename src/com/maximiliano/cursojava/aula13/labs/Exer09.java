package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Entre com a temperatura em Graus Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
				
		double temperaturaCelsius = 5*(temperaturaFarenheit - 32)/9;
				
		System.out.println("A temperatua em Farenheit "+temperaturaFarenheit+
				"F° em temperatura celsius é: "+ temperaturaCelsius+"C°");
	
		
		
		
	}

}
