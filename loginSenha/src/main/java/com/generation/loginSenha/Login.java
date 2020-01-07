package com.generation.loginSenha;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o seu login: ");
		String login = in.next();

		System.out.println("Digite a sua senha: ");
		String senha = in.next();

		if (login.equals ("leticia") && senha.equals ("123")){
			
			System.out.println("usuario logado com sucesso");
			
		} else {
			
			System.out.printf("Usuario ou senha incorretos");
		}
	}
}
