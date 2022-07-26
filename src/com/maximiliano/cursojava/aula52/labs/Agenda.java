package com.maximiliano.cursojava.aula52.labs;

import java.util.Arrays;

public class Agenda {

	private Contato[] contatos;
	
	
	public Agenda() {
		contatos = new Contato[5];
	}

	public void adcionarContato(Contato c) throws AgendaCheiaExcption {
		
		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia) {
			throw new AgendaCheiaExcption();
		}
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i]!=null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		return "Contatos na agenda" + Arrays.toString(contatos) + "\n";
	}
		
}
