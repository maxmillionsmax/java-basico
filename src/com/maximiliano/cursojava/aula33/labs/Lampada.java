package com.maximiliano.cursojava.aula33.labs;

public class Lampada {

	private String tensao;
	private String modelo;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbaju;
	private boolean ligada;
	
	public Lampada() {
		// TODO Auto-generated constructor stub
	}
	
	public Lampada(String tensao, String modelo, int potencia, String cor, String tipoLuz, int garantiaMeses,
			String[] tipos, boolean tipoAbaju, boolean ligada) {
		this.tensao = tensao;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbaju = tipoAbaju;
		this.ligada = ligada;
	}


	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isTipoAbaju() {
		return tipoAbaju;
	}
	public void setTipoAbaju(boolean tipoAbaju) {
		this.tipoAbaju = tipoAbaju;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	public void ligar() {
		setLigada(true);
	}
	public void desligada() {
		setLigada(false);
	}
	public void mostrarEstado() {
		
		if (isLigada()) {
			System.out.println("Lampada esta ligada");
		}else {
			System.out.println("Lampada esta desligada");
		}
	}
	public void mudarEstado() {
		
		if (isLigada()) {
			desligada();
		}else {
			ligar();
		}
	}
}
/*
	
	
}*/
