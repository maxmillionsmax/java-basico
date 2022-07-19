package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
					
		System.out.println("Escolha tipo da carne:");
		System.out.println("1 - file duplo:");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Entre com a quantidade (KG): ");
		double qtd = scan.nextDouble();
		double precoKG = 0;
		
		if (tipo == 1) {
			System.out.println(qtd +"kg - File duplo");
			if (qtd < 5) {
				precoKG = 4.9;
			}else {
				precoKG = 5.8;
			}
		}else if (tipo == 2) {
			System.out.println(qtd +"kg - Alcatra");
			if (qtd < 5) {
				precoKG = 5.9;
			}else {
				precoKG = 6.8;
			}
		}else if (tipo == 3) {

			System.out.println(qtd +"kg - Picanha");
			if (qtd < 5) {
				precoKG = 6.9;
			}else {
				precoKG = 7.8;
			}
		}
		double total = qtd * precoKG;
		System.out.println(qtd + " kg * "+precoKG+" = "+ total);
		
		System.out.println("Compra no cartão ? digite 1 para sim: ");
		int cartao = scan.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: "+desconto);
			System.out.println("Valor a pagar: "+(total - desconto));
		}else {
			System.out.println("Valor a pagar: "+ total);
		}
   }
}
