package com.maximiliano.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Entre com o preço");
		double valor = scan.nextDouble();
	
		if (valor <=10) {
			System.out.println("Esta barato");
		}else if (valor > 10 && valor <15) {
			System.out.println("peça um desconto");
		}else if (valor >=15 && valor <17) {
			System.out.println("Pesquise mais ");
		}else {
			System.out.println("Muito caro!!!");
		}
	}
	

}
