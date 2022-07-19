package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite o sexo (f-m): ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Sexo masculino: "+sexo);
		}else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Sexo feminino: "+sexo);
		}else {
			System.out.println("Sexo inválido");
		}
		
	}

}
