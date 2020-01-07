package com.generation.estoqueMedio;

import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		
		Scanner estoque = new Scanner(System.in);

		System.out.println("Digite a quantidade mínima: ");

		int qtdMinima = estoque.nextInt();

		System.out.println("Digite a quantidade máxima: ");

		int qtdMaxima = estoque.nextInt();

		float calculoEstoqueMedio = (qtdMinima + qtdMaxima)/2;

		System.out.println("O estoque médio de uma peça é " + calculoEstoqueMedio );
	}
}
