package com.maximiliano.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[30];
		
		temperaturas[0]=1;
		temperaturas[1]=3.6;
		temperaturas[2]=5.9;
		temperaturas[3]=9.9;
		temperaturas[4]=8.96;
		temperaturas[5]=10.5;
		temperaturas[6]=11.3;
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}
		System.out.println();
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}
}
