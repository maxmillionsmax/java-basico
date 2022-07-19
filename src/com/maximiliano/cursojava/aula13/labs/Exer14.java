package com.maximiliano.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Entre com tamanho do arquivo em MB: ");
		double tamanhoDoArquivo = scan.nextDouble();
		System.out.println("Entre com a velocidade da internet em MB ");
		double velocidadeDaInternet = scan.nextDouble();
		
		double tempo = tamanhoDoArquivo/velocidadeDaInternet;
		
		System.out.println("O Tempo estimado de download é de: " + tempo+" segundos");
	
		
		
		
	}

}
