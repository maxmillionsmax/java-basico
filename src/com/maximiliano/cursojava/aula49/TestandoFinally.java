package com.maximiliano.cursojava.aula49;

public class TestandoFinally {

	public static void main(String[] args) {
		
	
	int[] numeros = {4,8,16,32,64,128};

	int[] denominadores = {2,0,4,8,0};
	
	for (int i = 0; i < numeros.length; i++) {
		
		try {
		
			System.out.println(numeros[i] + "/" +denominadores[i] +" = "+(numeros[i]/denominadores[i]));
		
		} catch (ArithmeticException e) {
			
			System.out.println("erro, divisão por Zero" + e);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição do array invalida, " + e);
			
		}finally {
			System.out.println("Essa linha é sempre executada apos o try ou catch");
		}
		
	  }
	}
}
