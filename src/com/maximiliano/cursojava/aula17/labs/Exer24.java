package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		System.out.println("Preço do pão R$ 0.18");
		System.out.println("Panificadora Pão de Ontem");
		System.out.println("Entre com a quantidade de pães:");
		Scanner scanner = new Scanner(System.in);
		int quantidadePaes = scanner.nextInt();
		double precoTotal = 0;		
		for (int i = 1; i <=quantidadePaes; i++) {
			  precoTotal = 0.18*i;
			  System.out.println(i+" -  R$ "+precoTotal);
		}
		System.out.println("Pagará: "+precoTotal);
		
	  }
	}


