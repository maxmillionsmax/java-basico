package com.maximiliano.cursojava.aula48;

public class MultiplusCatch {

	public static void main(String[] args) {
		
	
	int[] numeros = {4,8,16,32,64,128};

	int[] denominadores = {2,0,4,8,0};
	
	for (int i = 0; i < numeros.length; i++) {
		
		try {
		
			System.out.println(numeros[i] + "/" +denominadores[i] +" = "+(numeros[i]/denominadores[i]));
		
		} catch (ArithmeticException e) {
			
			System.out.println("erro, divisão por Zero" + e.getMessage());
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição do array invalida, " + e.getMessage());
			
		}
		
	  }
	}
}
