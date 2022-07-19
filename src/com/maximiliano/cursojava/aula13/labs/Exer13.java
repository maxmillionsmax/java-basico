package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Entre com valor da hora de trabalho: ");
		double ganhPorHora = scan.nextDouble();
		System.out.println("Entre com horas trabalhadas: ");
		double hora = scan.nextDouble();
		
		double salarioBruto = ganhPorHora*hora;
		double inss = (salarioBruto/100)*8;
		double sindicato = (salarioBruto/100)*5;
		double ir = (salarioBruto/100)*11;
		double totalDescontos = inss+sindicato+ir;
		double salarioLiquido = (salarioBruto - totalDescontos);
		

		System.out.println();
	
		System.out.println("O seu salario bruto será "+salarioBruto);
		System.out.println();
		
		System.out.println("Desconto de inns "+inss);System.out.println();

		System.out.println("Desconto de sindicato "+sindicato);System.out.println();

		System.out.println("Desconto de IR "+ir);System.out.println();

		System.out.println("Desconto total "+totalDescontos);System.out.println();
		
		System.out.println("Salario liquido é "+salarioLiquido);System.out.println();
	
		
		
		
	}

}
