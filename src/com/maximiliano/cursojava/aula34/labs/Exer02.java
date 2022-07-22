package com.maximiliano.cursojava.aula34.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.somar(2, 2));
		imprimirTela(Calculadora.subtrair(2, 2));
		imprimirTela(Calculadora.multiplicar(2,2));
		imprimirTela(Calculadora.dividir(2,2));
		imprimirTela(Calculadora.potencia(2,2));
		imprimirTela(Calculadora.fatorial(3));
		
	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}
}
