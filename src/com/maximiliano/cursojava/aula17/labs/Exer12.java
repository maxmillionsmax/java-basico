package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero para obter tabuada");
		int numero1 = scanner.nextInt();

		int tabuada=0;
				
		System.out.println("Tabuada de "+numero1+":");
		if (numero1<10) {
			for (int i = 1; i <= 10; i++) {
				tabuada = numero1*i;
				System.out.println(numero1+" x "+i+" = "+tabuada);
			}
		}else{
			System.out.println("numero deve ser entre 1 e 9");
		}
	 }
	}

