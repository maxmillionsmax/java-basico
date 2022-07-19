package com.maximiliano.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com dia da semana:(1-7) ");
		
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 2:	
		case 3:	
		case 4: 
		case 5: 
		case 6:	System.out.println("Dia útil");
		break;
        case 7: System.out.println("sabado");
        break;
        case 1: System.out.println("Domingo");
        break;
		default:
			System.out.println("Dia da semana não existe");
			break;
		}
	}
}
