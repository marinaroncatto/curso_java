package application;

import java.util.Locale;
import java.util.Scanner;

public class Exe04_10 {
	
	public static void main (String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int count = 0;
		System.out.println(" ");
		System.out.println("NUMEROS PARES: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i]+"  ");
				count += 1;
			}
		}
		
		System.out.println("\n");
		System.out.println("QUANTIDADE DE PARES = "+count);
		
		sc.close();
		
		
	}
}
