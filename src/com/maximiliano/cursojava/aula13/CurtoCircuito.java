package com.maximiliano.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

				
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso &
				verdadeiro;
		boolean resultado = falso &&
				verdadeiro;

		System.out.println(resultado);
		System.out.println(resultado1);
		
		int resultado3 = 1+1-1+1/1+1*1;
		
		System.out.println(resultado3);
		
	}

}
