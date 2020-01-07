package com.generation.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha qual operação quer realizar: 1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão");
		System.out.println("1-Adição");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		int numero = entrada.nextInt();

		switch (numero) {
		
		case 1:
			System.out.println("Você escolheu Adição!");
			System.out.println("Escolha o primeiro valor: ");
			int valor1Adicao = entrada.nextInt();

			System.out.println("Escolha o segundo valor: ");
			int valor2Adicao = entrada.nextInt();

			int contaAdicao = valor1Adicao + valor2Adicao;
			System.out.println("O valor da adição de "+ valor1Adicao + " + " + valor2Adicao + " é: " + contaAdicao );

			break;
			
		case 2:
			System.out.println("Você escolheu Subtração!");
			System.out.println("Escolha o primeiro valor: ");
			int valor1Subtracao = entrada.nextInt();

			System.out.println("Escolha o segundo valor: ");
			int valor2Subtracao = entrada.nextInt();

			int contaSubtracao = valor1Subtracao - valor2Subtracao;
			System.out.println("O valor da subtração de "+ valor1Subtracao + " - " + valor2Subtracao + " é: " + contaSubtracao );
			
			break;
			
		case 3:
			System.out.println("Você escolheu Multiplicação!");
			System.out.println("Escolha o primeiro valor: ");
			int valor1Multiplicacao = entrada.nextInt();

			System.out.println("Escolha o segundo valor: ");
			int valor2Multiplicacao = entrada.nextInt();

			int contaMultiplicacao = valor1Multiplicacao * valor2Multiplicacao;
			System.out.println("O valor da multiplicação de "+ valor1Multiplicacao + " * " + valor2Multiplicacao + " é: " + contaMultiplicacao );
			
			break;
			
		case 4:
			
			System.out.println("Você escolheu Divisão!");
			System.out.println("Escolha o primeiro valor: ");
			int valor1Divisao = entrada.nextInt();

			System.out.println("Escolha o segundo valor: ");
			int valor2Divisao = entrada.nextInt();

			int contaDivisao = valor1Divisao / valor2Divisao;
			System.out.println("O valor da divisão de "+ valor1Divisao + " / " + valor2Divisao + " é: " + contaDivisao );

			break;
			
		default:
			System.out.println("O valor da variavel não é nenhum dos anteriores");

		}
	}
}
