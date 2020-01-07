package com.generation.idadeEmAnosMesesDias;

import java.util.Scanner;

public class Idade
{
    public static void main( String[] args )
    {
    	Scanner entrada = new Scanner(System.in);
    	
        System.out.println( "Digite os anos: " );
        int anos = entrada.nextInt();
        
        System.out.println( "Digite os meses: " );
        int meses = entrada.nextInt();
        
        System.out.println( "Digite os dias: " );
        int dias = entrada.nextInt();
        
        int idadeEmDias =  ((anos*365) + (meses*30) + dias) ;
        
        System.out.println( "Idade total em dias: " + idadeEmDias);
        
    }
}
