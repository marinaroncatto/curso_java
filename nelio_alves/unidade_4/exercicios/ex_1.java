package exercicios;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		// auto importação ctrl shift o
		
		/*Faça um programa para ler dois valores 
		 * inteiros, e depois mostrar na tela a 
		 * soma desses números com uma
		mensagem explicativa, conforme exemplos. */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA = "+soma);
		
		sc.close();
	}

}
