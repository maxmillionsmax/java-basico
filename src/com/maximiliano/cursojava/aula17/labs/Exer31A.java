package com.maximiliano.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31A {

	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de anos na empresa");
		Scanner scanner = new Scanner(System.in);
		int ano = scanner.nextInt();
		double salario = 1000;
		double percentual = 1.5;
		DecimalFormat format = new DecimalFormat("###,###.##");

		for (int i = 2; i <= ano ; i++) {
			percentual *=2; 
			salario +=(salario/100)*percentual;
			System.out.println(i+"º ano = "+format.format(salario)+" - "+percentual+"%");
		}
	  }
	}

