package com.maximiliano.cursojava.aula35.labs;

public class Calculadora {

	public static int fibonacci(int nun) {
		
		if (nun < 2) {
			return 1;
		}
		return fibonacci(nun - 1) + fibonacci(nun -2);
	}
}
