package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite o primeiro pre�o: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo pre�o: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro pre�o: ");
		int num3 = scan.nextInt();
						
		if (num1 < num2 && num1 < num3) {
			System.out.println("Menor pre�o � o primeiro: "+num1);
		}else if (num1 > num2 && num3 > num2)  {
			System.out.println("O Menor pre�o � segundo: " + num2);
		}else {
			System.out.println("O Menor pre�o � terceiro: "+ num3);
		}
		
	}

}
