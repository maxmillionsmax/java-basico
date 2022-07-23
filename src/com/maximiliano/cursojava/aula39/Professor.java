package com.maximiliano.cursojava.aula39;

public class Professor extends Pessoa{

	private double salario;
	private String[] cursos;
	
    public void verificarAcesso() {
		
		this.nomeVisibilidade = "Visivel";
		super.nomeVisibilidade = "Visivel";
	}
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	public double calcularSalarioLiquido() {
		
		return 0;
	}

}
