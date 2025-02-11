package application;

import java.util.Locale;
import java.util.Scanner;

public class Exe01_10 {

	public static void main(String[] args) {
		// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i]= sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
									
		}
		
		
		sc.close();
		
	}

}
