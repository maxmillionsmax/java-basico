package com.maximiliano.cursojava.aula52.labs;

public class AgendaCheiaExcption extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Agenda j� est� cheia";
	}
}
