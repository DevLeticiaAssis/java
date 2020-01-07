package com.generation.conversaoDolarParaReal;

import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		Scanner converter = new Scanner(System.in);

		System.out.println("Digite a cotação do dólar: ");
		
		float cotacaoDolar = converter.nextFloat();

		System.out.println("Digite o valor em dólar: ");

		float valorDolar = converter.nextFloat();

		float conversaoDolarEmReal = (cotacaoDolar * valorDolar);

		System.out.println("O valor em reais é: " + conversaoDolarEmReal);
	}
}
