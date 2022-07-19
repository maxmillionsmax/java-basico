package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Entre com a temperatura em Graus celsius: ");
		double temperaturaCelsius = scan.nextDouble();
				
		double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;
				
		System.out.println("A temperatua em celsius "+temperaturaCelsius+
				" em temperatura Fareheint é: "+ temperaturaFarenheit);
	
		
		
		
	}

}
