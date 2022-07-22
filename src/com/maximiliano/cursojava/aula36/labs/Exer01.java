package com.maximiliano.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda");
		String nome = scanner.nextLine();
		
		Agenda agenda = new Agenda("Nome_da_agenda");
		
		Contato[] contatos = new Contato[2];
		for (int i = 0; i < 2; i++) {
			
			System.out.println("Entre com as informações do contato "+(i+1));
			Contato c= new Contato();
			System.out.println("Entre com o nome: ");
			nome = scanner.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com o telefone: ");
			String telefone = scanner.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com o email: ");
			String email = scanner.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.ObterInfo());
		}
	}

}
