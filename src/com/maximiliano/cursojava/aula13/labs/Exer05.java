package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Digite a medida em metros: ");
		double metro = scan.nextDouble();
		
		double centimetro = metro*100;
				
		System.out.println(metro+ " metro(s) convertido para centimetro é: "+ centimetro + " centimetros");
	}

}
