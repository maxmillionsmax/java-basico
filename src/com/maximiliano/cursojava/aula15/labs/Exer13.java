package com.maximiliano.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com dia da semana:(1-7) ");
		
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 2:	System.out.println("Segunda");break;
		case 3:	System.out.println("Ter�a");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6:	System.out.println("Sexta");break;
        case 7: System.out.println("sabado");break;
        case 1: System.out.println("Domingo");break;
		default:
			System.out.println("Dia da semana n�o existe");
			break;
		}
	}
}
