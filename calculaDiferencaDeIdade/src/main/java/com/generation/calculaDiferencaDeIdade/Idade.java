package com.generation.calculaDiferencaDeIdade;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Idade {
    public static void main( String[] args ){
    
    	Scanner idade = new Scanner(System.in);
    	
        System.out.println( "Digite a sua idade: " );
        
        int idadeUsuario = idade.nextInt();
        
        System.out.println( "Digite a idade da sua mãe: " );
        
        int idadeMae = idade.nextInt();
        
        int calculoDiferencaIdade = idadeMae - idadeUsuario;
        
       System.out.println( "Minha mãe é " + calculoDiferencaIdade + " 27anos mais velha do que eu" );
    }
}
