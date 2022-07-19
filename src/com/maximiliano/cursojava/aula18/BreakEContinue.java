package com.maximiliano.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entre com numero");
		int numero = scanner.nextInt();
		System.out.println("entre com Limite");
		int numeroMax = scanner.nextInt();
		
		//BREAK--------------------------------
		/*
		for (int i = numero; i < numeroMax; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é "+i);
				break;
			}
		}
		
		//LABEL--------------
		
		
		for (int i = 0; i <= 4; i++) {
			rotulo1:{
			rotulo2:{
			rotulo3:{
				if (i == 1) {
					break rotulo1;
				}
				if (i == 2) {
					break rotulo2;
				}
				if (i == 3) {
					break rotulo3;
				
				}
				System.out.println("Rotulo 3");
			  }
			  System.out.println("Rotulo 2");
			 }
			 System.out.println("Rotulo 1");
			}
			System.out.println(i);
		  }*/
		
		//CONTINUE-----------------------------
		
		for (int i = numero; i < numeroMax; i++) {
			if (i % 7 == 0) {
				System.out.println();
				continue;
		       }
			System.out.println("O valor de i é "+i);
		}
	  }
    }
