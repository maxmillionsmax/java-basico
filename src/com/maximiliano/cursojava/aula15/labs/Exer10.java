package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite uma letra ");
		String turno = scan.next();
		
		
		switch (turno) {
		case "m":
		case "M":System.out.println("Bom dia!");break;
		case "v":
		case "V":System.out.println("Boa tarde");break;
		case "N":
		case "n":System.out.println("Boa noite");break;
		default:  System.out.println("Turno invalido");break;
		}
		}
		
	}


