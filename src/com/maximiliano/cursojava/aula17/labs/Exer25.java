package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		System.out.println("Lojas Tabajaras");
		Scanner scanner = new Scanner(System.in);
		
		boolean sair = false;
		String continuarCompra; 
		int quantidadeProdutos;
		double preco;
		double total;
		String outPut;
		double valorPago,troco;
		
		
		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = scanner.next();
			
			if (continuarCompra.equalsIgnoreCase("s")) {
				
				outPut = "Lojas Tabajara \n";
				
				System.out.println("Digite a quantidade de produtos da compra: ");
				quantidadeProdutos = scanner.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= quantidadeProdutos; i++) {
					System.out.println("Informe preço do produto "+i);
					preco = scanner.nextDouble();
					total+=preco;
					outPut +="Produdo "+i+": R$ "+preco+"\n";
				}
				outPut += "Total: R$ "+total;

				System.out.println("Total: R$ "+total);
				
				System.out.println("Entre com valor pago R$");
				valorPago = scanner.nextDouble();

				outPut+="\nDinheiro: R$ "+valorPago+"\n";
				
				troco = valorPago - total;

				outPut+= "Troco: R$ " +(troco);
				
				System.out.println(outPut);
				
				System.out.println();
				
			}else {
				sair = true;
			}
			
		} while (!sair);
		
	  }
	}


