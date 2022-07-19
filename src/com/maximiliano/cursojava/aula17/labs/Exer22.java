package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a quantidade de CDBs: ");
		int cd =  scanner.nextInt();
		int valorCd = 0;
		int soma = 0;
			for (int i = 1; i <= cd; i++) {
			System.out.println("Entre com o valor de cada CD "+i+"º CD");
			valorCd = scanner.nextInt();
		    soma+=valorCd;
			}
			double media = soma/cd;
			System.out.println("O valor medio gasto em CDBs "+media);
			System.out.println("A soma total gasto em todos os cd's é: "+soma);
	  }
	}


