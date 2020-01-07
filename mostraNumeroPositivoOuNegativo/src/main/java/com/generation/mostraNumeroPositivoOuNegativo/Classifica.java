package com.generation.mostraNumeroPositivoOuNegativo;

import java.util.Scanner;

public class Classifica {
	public static void main(String[] args) {

		int num;

		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("Digite 0 para sair! \n");
			System.out.print("Digite um número: ");
			num = entrada.nextInt();

			if (num > 0) {
				System.out.println("\nO número digitado foi " + num + " e ele é um número positivo \n");
			} else if (num < 0) {
				System.out.println("\nO número digitado foi " + num + " e ele é um número negativo \n");
			}
		} while (num != 0);
	}
}
