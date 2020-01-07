package com.generation.comissaoVendedores;

import java.util.Scanner;

public class Comissao 
{
    public static void main( String[] args )
    {
    	Scanner entrada = new Scanner(System.in);

    	System.out.println("Digite a identificacao do vendedor: ");
    	int idVendedor = entrada.nextInt();
    	
        System.out.println("Digite o ID da Peca: ");
        int idPeca = entrada.nextInt();
        
        System.out.println("Digite o preço unitario da peca: ");
        float preco = entrada.nextFloat();
        
        System.out.println("Digite a quantidade de peças vendidas: ");
        int pecasVendidas = entrada.nextInt();
        
        float comissaoVendedor = (float) (preco * pecasVendidas * (0.05));
        
        System.out.println( "O valor da comissão é de " + comissaoVendedor + " reais." );
    }
}
