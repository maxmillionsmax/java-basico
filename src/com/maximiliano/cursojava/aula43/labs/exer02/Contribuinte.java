package com.maximiliano.cursojava.aula43.labs.exer02;

public abstract class Contribuinte {

	private String nome;
	private double rendaBruta;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	} 
	
	public abstract double calcularImposto();
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", rendaBruta=" + rendaBruta + "]\n";
	}
	
}
