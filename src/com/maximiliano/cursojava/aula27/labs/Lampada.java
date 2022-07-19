package com.maximiliano.cursojava.aula27.labs;

public class Lampada {

	String tensao;
	String modelo;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbaju;
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	void desligada() {
		ligada = false;
	}
	
	void mostrarEstado() {
		
		if (ligada) {
			System.out.println("Lampada esta ligada");
		}else {
			System.out.println("Lampada esta desligada");
		}
	}
	
	void mudarEstado() {
		
		if (ligada) {
			desligada();
		}else {
			ligar();
		}
		
	}
}
