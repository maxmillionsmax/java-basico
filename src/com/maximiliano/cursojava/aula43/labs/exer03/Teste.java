package com.maximiliano.cursojava.aula43.labs.exer03;

public class Teste {

	public static void main(String[] args) {

		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelociadade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelociadade(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelociadade(0.5);
		
		Animal[] animals = new Animal[3];
		
		animals[0] = camelo;
		animals[1] = tubarao;
		animals[2] = urso;
		
		System.out.println("--------------------------------------------------");
		for (Animal animal : animals) {
			System.out.println(animal);
		System.out.println("--------------------------------------------------");
		}
		
	}

}
