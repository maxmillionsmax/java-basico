package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
					
		System.out.println("Escolha o tipo de combustivel: A-alcool ou G-gasolina");
		String combustivel = scan.next();		
		System.out.println("Quantos litros voce deseja? ");
		double quantidade = scan.nextDouble();
		double litroGasolina = 2.5;
		double litroAlcool = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;

		if (combustivel.equalsIgnoreCase("a")) {
				if (quantidade <=20) {
					percDesconto = 3;
				}else {
					percDesconto = 5;
				}
		total = quantidade * litroAlcool;
		
		}else if (combustivel.equalsIgnoreCase("g")) {
				if (quantidade <=20) {
					percDesconto = 3;
				}else {
					percDesconto = 5;
				}
		total = quantidade * litroGasolina;
		
		}
		totalDesconto = (total/100)*percDesconto;
		
		double precoAApagar = total - totalDesconto;
		
		System.out.println("Valor a ser: "+precoAApagar);
		
						
	  }
}
