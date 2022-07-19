package com.maximiliano.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o elemento "+i);
			vetorA[i] = scanner.nextInt();
		}
		
		boolean primo = true;
		String msg;
		
		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			msg = "";
			if (primo) {
				msg = " é Primo";
			}else {
				msg = " Não é primo";
			}
			
			System.out.println(vetorA[i] + msg);
		}
		
	}

}
