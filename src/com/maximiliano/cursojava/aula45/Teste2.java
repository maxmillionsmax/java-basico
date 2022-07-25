package com.maximiliano.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {

	
		Object object = obterString();
		String string = (String) object;
		
		Object object2 = "Outra String";
		String string2 = (String) object2;
		
		Object object3 = new Object();
		String string3 = (String) object3;
		
		Object object4 = obterInteiro();
		String string4 = (String) object4;
		
	}
	
	public static String obterString() {
		return "minha String";
		
	}
	public static int obterInteiro() {
		return 1;
		
	}

}
