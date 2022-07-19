package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Entre com valor da hora de trabalho: ");
		double ganhPorHora = scan.nextDouble();
		System.out.println("Entre com horas trabalhadas: ");
		double hora = scan.nextDouble();
		
		double quantia_a_receber = ganhPorHora*hora;
				
		System.out.println();
	
		System.out.println("O seu salario será "+quantia_a_receber);
		
		
		
	}

}
