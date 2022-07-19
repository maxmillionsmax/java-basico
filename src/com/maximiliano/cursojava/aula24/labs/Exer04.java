package com.maximiliano.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2014;
		livro.isbn = "132132sdf3213fsd";
		livro.emprestadoA = "Maximiliano";
		livro.dataEntrega = new Date();
		
		System.out.println("Nome do livro = "+livro.nome);
		System.out.println("autro do livro = "+livro.autor);
		System.out.println("Ano lancamento do livro = "+livro.anoLancamento);
		System.out.println("Ano lancamento do livro = "+livro.emprestadoA);
		System.out.println("Ano lancamento do livro = "+livro.dataEntrega);
		
	}

}
