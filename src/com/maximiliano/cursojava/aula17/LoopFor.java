package com.maximiliano.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Valor de i  = "+ i);
		}
		System.out.println();
		for (int j = 5; j >= 0; j--) {
			System.out.println("Valor de j  = "+ j);
		}
		for (int i = 0, j = 10; i <= j; i++,j--) {
			System.out.println("i = "+ i + "; j = "+j);
		}
		int count  =0;
		for (;count < 5;) {
			System.out.println("Valor de count: "+count);
			count+=2;
		}
		for (int cont = 0; cont < 10; cont+=2) {
			System.out.println("Valor de contador = "+cont);
		}
		
		int soma = 0;
		for (int i = 1; i < 5; soma += i++); 
			System.out.println("O valor da soma = "+ soma);

		for (int i = 0; i <= 5; i++) {
		System.out.println("Valor de i  = "+ i);
		System.out.println("Valor de outro valor: ");	
		}
	}
}
