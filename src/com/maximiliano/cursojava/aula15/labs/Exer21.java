package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
					
		System.out.println("Entre com a quantidade (KG) de morango");
		double qtdmorango = scan.nextDouble();
		System.out.println("Entre com a quantidade (KG) de morango");
		double qtdmaca = scan.nextDouble();

		double precoKgMorango = 0;
		if (qtdmorango <= 5) {
			precoKgMorango =2.5;
		}else {
			precoKgMorango =2.2;
		}
		
		double precoKgMaca = 0;
		if (qtdmaca <= 5) {
			precoKgMaca =1.8;
		}else {
			precoKgMaca =1.5;
		}
		
		double precoTotalMorango = qtdmorango * precoKgMorango;
		double precoTotalMaca = qtdmaca + precoKgMaca;
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((qtdmorango + qtdmaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial/100) *10);
		}
		
		System.out.println("Preco total = "+ precoTotal);
	  }
}
