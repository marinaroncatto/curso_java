package aula_1_exercicios;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro 
		 * e dizer se este número é par ou ímpar.
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n%2 ==0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
