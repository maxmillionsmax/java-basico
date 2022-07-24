package com.maximiliano.cursojava.aula43.labs.exer03;

public class Animal {

	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velociadade;
	
	public Animal() {
		this.patas = 4;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelociadade() {
		return velociadade;
	}
	public void setVelociadade(double velociadade) {
		this.velociadade = velociadade;
	}
	
	@Override
	public String toString() {
		return "Animal: \nnome: " + nome + ", \ncomprimento: " + comprimento + ", \npatas: " + patas + ", \ncor: " + cor
				+ ", \nambiente: " + ambiente + ", \nvelociadade: " + velociadade;
	}
	
}
