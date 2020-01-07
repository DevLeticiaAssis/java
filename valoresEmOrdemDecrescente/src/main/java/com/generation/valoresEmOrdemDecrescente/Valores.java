package com.generation.valoresEmOrdemDecrescente;

import java.util.Arrays;
import java.util.Scanner;

public class Valores {
	public static void main( String[] args )
    {
    	Scanner numeros = new Scanner (System.in);
    	
        int[] listaDeNumeros = new int[3];
        
        for (int i = 0; i < listaDeNumeros.length; i++) 
        {
        	System.out.print("Número " + (i+1) + ": ");
	       listaDeNumeros[i] = (numeros.nextInt());
	    }
        
        Arrays.sort(listaDeNumeros);
        
        System.out.print("Ordem decrescente:    "); 
     		  
     		 for(int j= listaDeNumeros.length - 1;j >= 0;j--) 
   
     	  {
     		System.out.print(listaDeNumeros[j]+ "  ");  
     		
		  }
      
    }
}
