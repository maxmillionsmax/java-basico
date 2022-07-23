package com.maximiliano.cursojava.aula36.labs;

public class Professor {

	private String nome;
	private String departamento;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		return "Professor = "+nome+"\n";
	}
	
}
