package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		

		System.out.println("Digite a primeira lado: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite a segunda lado: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite a terceiro lado: ");
		double lado3 = scan.nextDouble();
			
		if(lado1>0 && lado2>0 && lado3>0){
			if (((lado1+lado2)>lado3) || ((lado1+lado3)>lado2) || ((lado3+lado2)>lado1)){
				if ((lado1==lado2)&&(lado1==lado3)&&(lado2==lado3)) {
					System.out.println("Esse triangulo é equilatero!");
				}else if (lado1!=lado2 && lado2!=lado3 && lado3!=lado1) {
					System.out.println("Esse triangulo é Escaleno!");
				}else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
					System.out.println("Esse triangulo é Isosceles!");
				}
			 }
		}else{
			System.out.println("Não é um triangulo");
		}
	}
}


