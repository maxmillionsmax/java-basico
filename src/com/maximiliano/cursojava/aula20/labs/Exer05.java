package com.maximiliano.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][8];
		
		boolean sair = false;
		byte opcao;
		
		while(!sair) {
			System.out.println("Digite 1 para adcionar para compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			
			opcao = scanner.nextByte();
			
			if (opcao == 1) {
			
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido) {
				  System.out.println("Entre com o m�s");
				  mes = scanner.nextInt();
				  if (mes > 0 && mes <=12) {
					  mesValido = true;
				    }else {
						System.out.println("Digite mes Valido 1 - 12");
					}
				}
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
				  System.out.println("Entre com o dia do m�s");
				  dia = scanner.nextInt();
				  if (dia > 0 && dia <=31) {
					  diaValido = true;
				    }else {
						System.out.println("Digite dia Valido");
					}
				}
				  int hora = 0;
				  boolean horaValida = false;
				  while(!horaValida) {
					  System.out.println("Entre com a hora do compromisso");
					  hora = scanner.nextInt();
					  if (hora >= 0 && hora <=8) {
						  horaValida = true;
					    }else {
							System.out.println("Digite hora valida 0h -8h");
					    }
				    }
				  mes--;
				  dia--;
				  System.out.println("Digite o compromisso");
				  compromissos[mes][dia][hora] = scanner.next();
		
			}else if (opcao == 2) {
			
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido) {
				  System.out.println("Entre com o m�s");
				  mes = scanner.nextInt();
				  if (mes > 0 && mes <=12) {
					  mesValido = true;
				    }else {
						System.out.println("Digite mes Valido 1 - 12");
					}
				}
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
				  System.out.println("Entre com o dia do m�s");
				  dia = scanner.nextInt();
				  if (dia > 0 && dia <=31) {
					  diaValido = true;
				    }else {
						System.out.println("Digite dia Valido");
					}
				}
				  int hora = 0;
				  boolean horaValida = false;
				  while(!horaValida) {
					  System.out.println("Entre com a hora do compromisso");
					  hora = scanner.nextInt();
					  if (hora >= 0 && hora <=8) {
						  horaValida = true;
					    }else {
							System.out.println("Digite hora valida 0h -8h");
					    }
				    }
				  mes--;
				  dia--;
			    System.out.println("O Compromisso agendado �: ");	
				System.out.println(compromissos[mes][dia][hora]);
				
			}else if (opcao == 0) {
				sair = true;
			}else {
				System.out.println("Op��o invalida digite a op��o valida!");
			}
		}

	}
}

