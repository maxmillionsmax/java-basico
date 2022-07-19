package com.maximiliano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		
		while(!sair) {
			System.out.println("Digite 1 para adcionar para compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			
			opcao = scanner.nextByte();
			
			if (opcao == 1) {
			
				boolean diaValido = false;
				int dia = 0;
				int hora = 0;
				while(!diaValido) {
				  System.out.println("Entre com o dia do mês");
				  dia = scanner.nextInt();
				  if (dia > 0 && dia <=31) {
					  diaValido = true;
				    }else {
						System.out.println("Digite dia Valido");
					}
				  boolean horaValida = false;
				  while(!horaValida) {
					  System.out.println("Entre com a hora do compromisso");
					  hora = scanner.nextInt();
					  if (hora >= 0 && hora <=24) {
						  horaValida = true;
					    }else {
							System.out.println("Digite hora valida 0h -24h");
					    }
				    }
				}
				dia--;
				System.out.println("Digite o compromisso");
				compromissos[dia][hora] = scanner.next();
			
			}else if (opcao == 2) {
			
				boolean diaValido = false;
				int dia = 0;
				int hora = 0;
				while(!diaValido) {
				  System.out.println("Entre com o dia do mês");
				  dia = scanner.nextInt();
				  if (dia > 0 && dia <=31) {
					  diaValido = true;
				    }else {
						System.out.println("Digite dia Valido");
					}
				  boolean horaValida = false;
				  while(!horaValida) {
					  System.out.println("Entre com a hora do compromisso");
					  hora = scanner.nextInt();
					  if (hora >= 0 && dia <=24) {
						  horaValida = true;
					    }else {
							System.out.println("Digite hora valida 0h -24h");
					    }
				    }
				}
				dia--;
			    System.out.println("O Compromisso agendado é: ");	
				System.out.println(compromissos[dia][hora]);
				
			}else if (opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opção invalida digite a opção valida!");
			}
		}

	}

}
