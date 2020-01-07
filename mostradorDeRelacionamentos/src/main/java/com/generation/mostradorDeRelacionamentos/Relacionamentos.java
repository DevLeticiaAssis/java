package com.generation.mostradorDeRelacionamentos;

import java.util.Scanner;

public class Relacionamentos 
{
    public static void main( String[] args )
    {
    	Scanner entrada = new Scanner(System.in);

        System.out.println( "Digite o primeiro número: " );
        float primeiroNum = entrada.nextFloat();
        
        System.out.println( "Digite o segundo número: " );
        float segundoNum = entrada.nextFloat();
        
        Boolean Igual=false, NaoIgual=false, Maior=false, Menor=false, MaiorOuIgual=false, MenorOuIgual=false;
        
        if (primeiroNum == segundoNum) Igual = true;
        if (primeiroNum != segundoNum) NaoIgual = true;
        if (primeiroNum > segundoNum) Maior = true;
        if (primeiroNum < segundoNum) Menor = true;
        if (primeiroNum >= segundoNum) MaiorOuIgual = true;
        if (primeiroNum <= segundoNum) MenorOuIgual = true;
        
        System.out.println( "Igual = " + Igual );
        System.out.println( "Não Igual = " + NaoIgual  );
        System.out.println( "Maior = " + Maior );
        System.out.println( "Menor = " + Menor );
        System.out.println( "Maior ou Igual = " + MaiorOuIgual );
        System.out.println( "Menor ou Igual = " + MenorOuIgual );
    }
}
