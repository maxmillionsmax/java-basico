package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod,qtd;
		double total = 0;
		String outPut = "";
		
		System.out.println("Fechar digite codigo 0 e quantidade 0.");
		do {
			System.out.println("Entre com o codigo do produto. ");
			cod = scanner.nextInt();
			System.out.println("Entre com a quantidade. ");
			qtd = scanner.nextInt();
			
			if (cod == 0 && qtd ==0) {
				naoTerminar = false;
				outPut+= "Total a pagar: "+total;
			}else {
				if (cod == 100) {
					outPut+= "Cachorro Quente - R$ 1,20 x " +qtd;
					outPut+= " = " + (1.2*qtd)+"\n";
					total+=1.2*qtd;
				} else if (cod == 101) {
					outPut+= "Bauru Simples - R$ 1,30 x " +qtd;
					outPut+= " = " + (1.3*qtd)+"\n";
					total+=1.3*qtd;
				}else if (cod == 102) {
					outPut+= "Bauru com ovo - R$ 1,50 x " +qtd;
					outPut+= " = " + (1.5*qtd)+"\n";
					total+=1.5*qtd;
				}else if (cod == 103) {
					outPut+= "Hambúrguer - R$ 1,20 x " +qtd;
					outPut+= " = " + (1.2*qtd)+"\n";
					total+=1.2*qtd;
				}else if (cod == 104) {
					outPut+= "Cheeseburguer - R$ 1,30 x " +qtd;
					outPut+= " = " + (1.3*qtd)+"\n";
					total+=1.3*qtd;
				}else if (cod == 105) {
					outPut+= "Refrigerante - R$ 1,00 x " +qtd;
					outPut+= " = " + (1*qtd)+"\n";
					total+=1*qtd;
				}
				
			}
			
			
		} while (naoTerminar);
		System.out.println(outPut);
	  }
	}


