package com.generation.primeiroPrograma;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App //toda classe começa com a letra maiuscula
{
    public static void main( String[] args )
    {
        // comentários //ou /**/
    	// declaração de variáveis
    	
    	int i;
    	
    	//tipos de variaveis
    	
    	//tipos primitivos - ocupa um espaço na memoria
    	int a=0; //numeros inteiros. ex: 1, 100, -5, 0.
    	float b=0; //numeros inteiros e quebrados. Ex: 1.5,0
    	double c=0; //numeros inteiros e quebrados. Ex: 1.5,0
    	boolean d= false; //verdadeiro ou falso
    	char e='a'; //1 caractere
    	
    	int g, h;
    	int j=0, l=1;
    	
    	//ocupa 1bit
    	String f= "texto"; //texto
    	
    	//palavras reservadas
    	//não podemos usar como nome de uma variavel
    	
    	Date jj; // tipo Data
    	
    	Calendar dd; //evolução do tipo Date 
    	
    	//atribuir valor a variavel - não esquecer ;
    	a=123;
    	
    	//incremento e decremento de valores em variaveis;
    	i++; //i=i+1
    	i+=10; // i=i+10;
    	i--; // i= i-1
    	
    	//if/else (se/senao)
    	if(i<10) {
    		
    	} else if (i > 10) {
    		
    	}else {
    		
    	}
    	
    	//switch case
    	switch (i) {
    	case 1: 
    		System.out.println("valor é 1");
    		System.out.println("valor não é 0");
    	break;
    	
    	case 2: System.out.println("valor é 5");
    	case 3: System.out.println("valor é 6");
    	
    	default:
    		System.out.println("qdo não atender nenhum dos case");
    	break;
    	
    	}
    	
    	//laços de repetição
    	
    	for (int k= 0; k <args.length; k++) {
    		String string = args[k];
    		
    		//instruções
    		
    		if (k==3)
    		continue; //não faça para o 3
    		
    		if(k==5)
    		break; //interrompe o loop no 5
    	}
    	
    	//while (verifica a condição primeiro, depois executa)
    	while (a != 123) {
    		//nunca entrará
    	}
    	
    	//do while (executa, depois verifica a condição)
    	do {
    		//entra 1 vez
    	}while (a != 123);
    	
    	//foreach
    	for (String string : args) {//usa qdo varrer todos os elemetos do array
    }
    	
    	//comparação
    	// == igualdade
    	// != diferença
    	// > maior
    	// >= maior ou igual
    	// < menor
    	// <= menor ou igual
    	// && e (a>0) e (a < 3)
    	// || ou (a>0) ou (a < 3)
    	
    	//array ou vetor
    	int[] ar;
    	
    	//comandos
    	System.out.print("b");// escreve no console
    	System.out.println("b"); // escrever no console para pular linha
    	
    	Scanner sn = new Scanner(System.in);
    	f= sn.nextLine();//ler uma linha de texto digitado
    	i= sn.nextInt();//ler valor do tipo inteiro
    	g= sn.nextDouble();//ler valor do tipo inteiro
    	
    }
};