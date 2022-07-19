package com.maximiliano.cursojava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		
		int ano = 0;
		for (int a = 80000, b =200000;  a < b ; a+=a*0.03,b+=b*0.015) {
			ano++;
			System.out.println("A= "+a+"  B= "+b+" quantidade de anos= "+ano );
			}
		System.out.println("A cidade A terá a mesma população de B em "+ano);
		
	
	int popA = 80000;
	int popB = 200000;
	
	int cont = 0;
	while(popA < popB) {
		popA+=(popA/100)*3;
		popB+=(popB/100)*1.5;
		cont++;
	 }
	System.out.println("população a "+popA);

	System.out.println("população b "+popB);
	
	System.out.println("Anos para igualar: "+cont);
	}

  }
