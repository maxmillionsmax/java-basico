package com.maximiliano.cursojava.aula34;

public class TesteCalculadora {
	
	static int resultadoSoma;

	public static void main(String[] args) {

		resultadoSoma = MinhaCalculadora.soma(1, 2);
		
		soma2Valores(2, 1);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1 , num2);
	}
}
