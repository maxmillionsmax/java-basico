package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Entre com primeiro numero inteiro: ");
		int numero1 = scan.nextInt();
		System.out.println("Entre com segundo numero inteiro: ");
		int numero2 = scan.nextInt();
		System.out.println("Entre com Terceiro numero real: ");
		double numero3 = scan.nextDouble();
		
		int resultado_1 = (numero1*2) * numero2/2;
		double resultado_2 =(numero1*3 + numero3);
		double resultado_3= Math.pow(numero3, 3); 
		
						
		System.out.println("O produto do dobro de "+numero1+ " com a metade de "+
		                   numero2+" é "+ resultado_1);
		
		System.out.println("A soma do triplo de "+numero1+ " com "+
                numero3+" é "+ resultado_2);
		
		System.out.println("O terceiro numero ao cubo é: "+resultado_3);
	
	
		
		
		
	}

}
