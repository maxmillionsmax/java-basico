package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima:");
		String respota1 = scan.next();
		System.out.println("Esteve no local do crime:");
		String respota2 = scan.next();
		System.out.println("Mora perto da vitima:");
		String respota3 = scan.next();
		System.out.println("Devia para a vitima:");
		String respota4 = scan.next();
		System.out.println("Já trabalhou com a vitima:");
		String respota5 = scan.next();
		int contador = 0;
		
		if (respota1.equalsIgnoreCase("sim")) {
			contador++;
		}
		if (respota2.equalsIgnoreCase("sim")) {
			contador++;
		}
		if (respota3.equalsIgnoreCase("sim")) {
			contador++;
		}
		if (respota4.equalsIgnoreCase("sim")) {
			contador++;
		}
		if (respota5.equalsIgnoreCase("sim")) {
			contador++;
		}
			if (contador == 2) {
				System.out.println("Suspeito");
			}else if (contador == 3 || contador ==4) {
				System.out.println("Cumplice");
			}else if (contador == 5) {
				System.out.println("Assassino");
			}else {
				System.out.println("inocente");
			}
		
	}
}
