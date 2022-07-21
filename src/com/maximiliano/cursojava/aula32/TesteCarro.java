package com.maximiliano.cursojava.aula32;

public class TesteCarro {

	public static void main(String[] args) {
		
        Carro carro = new Carro();
		carro.setMarca("Fiat");
		carro.setModelo("Van");
		carro.setNumPassageiros(10);
		carro.setCapCombustivel(56.5);
		
		System.out.println(carro.getMarca()+ " "+ carro.getModelo());
        
	}

}
