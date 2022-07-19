package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		String senha;

		boolean check= false;

		do {
			System.out.println("Digite o nome de usuario");
			nome = scan.next();

			System.out.println("Digite a senha de usuario");
 		    senha = scan.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Digite novamente, Senha e usuario não podem ser iguais!");				
			}else {
				check = true;
				System.out.println("Ok!");				
			}
			
		} while(!check);
	
     }

  }
