package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		double num3 = scan.nextDouble();
						
		if(num1 > num2 && num1 > num3 && num2> num3 ) {
			System.out.println("Ordem decrescente é: " +num1+" "+num2+" "+num3);
			
		}else if (num3 > num2 && num3 > num1 && num2 > num1 ){
			System.out.println("Ordem decrescente é: " +num3+" "+num2+" "+num1);
			
		}else if (num2 > num1 && num2 > num3 && num3 > num1){
			System.out.println("Ordem descrecnte é "+num2+" "+num3+" "+ num1);
			
		}else if (num2 > num1 && num2 > num3 && num3 < num1){
			System.out.println("Ordem decrescente é "+num2+" "+num1+" "+num3);
			
		}else if (num3 > num1 && num3 > num2 && num1 > num2){
			System.out.println("Ordem decrescente é "+num3+" "+num1+" "+num2);
			
		}else {
			System.out.println("Ordem decrescente é "+num1+" "+num3+" "+num2);
		}
	}
}
