package com.maximiliano.cursojava.aula19.labs;

public class Exer18 {

	public static void main(String[] args) {

		int[] idades = new int[10];
		
		idades[0] = 1;
		idades[1] = 45;
		idades[2] = 65;
		idades[3] = 21;
		idades[4] = 14;
		idades[5] = 13;
		idades[6] = 29;
		idades[7] = 27;
		idades[8] = 38;
		idades[9] = 39;	
						
		int maior = idades[0];
		int menor = idades[0];
		
		int indexMaior = 0;
		int indexMenor = 0;
		
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			}else if(idades[i] < menor) {
				menor = idades[i];
				indexMenor = i;
			}
		  }
		System.out.print("As idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + "  ");
		}
		System.out.println();

		System.out.println("A menor idade é =  "+menor);

		System.out.println("Indice menor idade: "+indexMenor);
		
		System.out.println("A maior idade é =  "+maior);

		System.out.println("Indice maior idade: "+indexMaior);
	
	}

}
