package com.maximiliano.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal{

	private String alimento;
	
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public Mamifero() {
		super();
		this.alimento = "mel";
		this.setCor("castanho");
		this.setAmbiente("terra");
	}
	@Override
	public String toString() {
		return super.toString() + "\nalimento: " + alimento;
	}
	
}
