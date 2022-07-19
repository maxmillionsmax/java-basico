package com.maximiliano.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome,sexo,estadoCivil;
		int idade;
		double salario;

		boolean check= false;

		do {
			System.out.println("Entre com o nome");
			nome = scan.next();
			
			if (nome.length()>3) {
				check = true;
			}else {
				System.out.println("Nome precisa de mínimo de 3 caracteres!");
		  }			
		} while(!check);
		
		check = false;
		
		do {
			System.out.println("Entre com a idade.");
			idade = scan.nextInt();
			
			if (idade>=0 && idade <=150) {
				check = true;
			}else {
				System.out.println("Idade deve ser 0 ou menor que 150.");
		  }			
		} while(!check);
		
		check = false;
		
		do {
			System.out.println("Entre com o salario.");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				check = true;
			}else {
				System.out.println("Salario deve ser maior que 0.");
		  }			
		} while(!check);
		
		check = false;
		
		do {
			System.out.println("Entre com o sexo");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				check = true;
			}else {
				System.out.println("Sexo deve ser f(feminino) ou m(masculino)");
		  }			
		} while(!check);
		
		check = false;
		
		do {
			System.out.println("Entre com o estado civil");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s")||
					estadoCivil.equalsIgnoreCase("c")||
					estadoCivil.equalsIgnoreCase("v")||
					estadoCivil.equalsIgnoreCase("d")) {
				check = true;
			}else {
				System.out.println("Estado civil dever 's' 'c' 'v' ou 'd'");
		  }			
		} while(!check);
		
		System.out.println("As seguinte informações foram coletadas: ");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salario "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil "+estadoCivil);
     }

  }
