package com.maximiliano.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		
		contato1.nome = "Maximiliano";
		contato1.endereco = "Avenida Paulista";
		contato1.email = "maximiliano@max";
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "9879654655";
		contato1.telefones[2] = "0980980980";
		
		System.out.println("contato1.nome -> "+contato1.nome);
		System.out.println("contato1.endereco -> "+contato1.endereco);
		System.out.println("contato1.email -> "+contato1.email);
		System.out.println("contato1.telefones[0] -> "+contato1.telefones[0]);
		System.out.println("contato1.telefones[1] -> "+contato1.telefones[1]);
		System.out.println("contato1.telefones[2] -> "+contato1.telefones[2]);
		
	}

}
