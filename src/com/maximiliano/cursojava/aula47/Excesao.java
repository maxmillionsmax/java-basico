package com.maximiliano.cursojava.aula47;

public class Excesao {

	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exption");
			
			vetor[4] = 5;
			
			System.out.println("N�o ser� impresso");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.println("Excess�o ao acessar um indice do vetor que n�o existe e tipo de erro::::" + e.getMessage());
		}

		System.out.println("Esse texto ser� impresso ap�s a exception");
	}

}
