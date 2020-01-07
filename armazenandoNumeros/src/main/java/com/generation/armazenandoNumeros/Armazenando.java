package com.generation.armazenandoNumeros;

import java.util.Scanner;

public class Armazenando 
{
    public static void main( String[] args ){
    	
    	int num;

		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite um número: ");
			num = entrada.nextInt();

			if (num > 0) {
				System.out.println("A=" + num + " - número positivo\n");
			} else if (num < 0) {
				System.out.println("B=" + num + " - número negativo\n");
			}
	}
}
