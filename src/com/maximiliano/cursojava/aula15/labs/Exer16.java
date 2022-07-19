package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite -a- na equação do segundo grau: ");
		double a = scan.nextDouble();
		
		System.out.println("Digite -b- na equação do segundo grau: ");
		double b = scan.nextDouble();
		
		System.out.println("Digite -c- na equação do segundo grau: ");
		double c = scan.nextDouble();
		
		
		if(a != 0) {
			
			double delta = (Math.pow(b, 2)) - (4*a*c);
			double raiz1 = ((-b) + Math.sqrt(delta))/(2*a);
			double raiz2 = ((-b) - Math.sqrt(delta))/(2*a); 
			
		   if (delta<0) {
			System.out.println("Delta negativo, não possui raizes reais!");
			System.out.println("Delta = "+delta);
		   }else if (delta == 0) {
			   System.out.println("Delta = "+delta);
			   System.out.println("Delta igual a zero, possui raizes iguais!");
			   System.out.println("A raiz um é: "+raiz1+" = "+raiz2);
			  
		   }else if(delta>0) {
			   System.out.println("Delta = "+delta);
			   System.out.println("Delta positivo, equção possui duas raizes reais");
			   System.out.println("A raiz um é: "+raiz1);
			   System.out.println("A raiz dois é: "+raiz2);
		   }
		}else {
			System.out.println("Não é uma equação do segundo grau! a = "+a);
		}					
	}
}


