package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com numero para gerar a tabuada");
		int numero1 = scanner.nextInt();
		boolean invalido = true;
		int numFinal,numInicio;
		
		do {
			System.out.println("Entre com inicio da tabuada");
			 numInicio = scanner.nextInt();
			
			System.out.println("Entre com final da tabuada");
			 numFinal = scanner.nextInt();

			 if (numFinal > numInicio) {
				 invalido = false;
			 }else {
				 System.out.println("Primeiro termo da tabuada deve ser menor que segundo termo");
			}
		} while (invalido);
		
		System.out.println("Tabuada de "+numero1+":");
		System.out.println("Começar por: "+numInicio);
		System.out.println("Terminar em: "+numFinal);
		
		for (int i = numInicio; i <= numFinal; i++) {
			System.out.println(numero1 +" x "+i+" = "+ (numero1*i));
		}
					
	  }
	}

