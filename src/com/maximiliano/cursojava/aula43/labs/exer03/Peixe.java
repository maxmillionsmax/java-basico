package com.maximiliano.cursojava.aula43.labs.exer03;

public class Peixe extends Animal{

	private String caracteristicas;
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.caracteristicas = "Barbatanas e Caldas";
	}
	@Override
	public String toString() {
		return super.toString() + " \nCaracteristicas: " + caracteristicas;
	}
	
}
