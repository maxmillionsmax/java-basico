package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com 1º:");
		double numero1 = scan.nextDouble();
		System.out.println("Entre com 2º:");
		double numero2 = scan.nextDouble();
		
		System.out.println("Qual operção vc deseja realizar ( + - / *) ?");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = numero1 + numero2;break;
		case "-": resultado = numero1 - numero2;break;
		case "*": resultado = numero1 * numero2;break;
		case "/": resultado = numero1 / numero2;break;
		default:
			System.out.println("Operação inválida! ");
			valida = false;
		}
		
		if (valida) {
			System.out.println("Resultado: "+resultado);
				if (resultado >=0) {
					System.out.println("Resultado positivo!");
				}else {
					System.out.println("Resultado negativo");
				}
				if (resultado % 2 ==0) {
					System.out.println("Resultado é par");
				}else {
					System.out.println("Resultado é impar");
				}
		   }
						
	   }
}
