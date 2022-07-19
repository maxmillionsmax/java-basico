package com.maximiliano.cursojava.aula19.labs;

public class Exer17 {

	public static void main(String[] args) {

		int[] idades = new int[10];
		int maisDe35 = 0;
		
		idades[0] = 70;
		idades[1] = 20;
		idades[2] = 15;
		idades[3] = 2;
		idades[4] = 15;
		idades[5] = 5;
		idades[6] = 2;
		idades[7] = 2;
		idades[8] = 15;
		idades[9] = 3;	
						
		
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 35) {
				maisDe35++;
			}
		  }
		System.out.print("Vetor A = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + "  ");
		}
		System.out.println();

		System.out.println("A quantidade de pessoas com mais 35 são "+maisDe35);
	
	}

}
