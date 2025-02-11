package application;

import java.util.Locale;
import java.util.Scanner;

public class Exe05_10 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		
		
		
		double max = 0.0;
		int position = 0;
		
		for(int i = 0; i < vect.length; i++) {
			if (max < vect[i]) {
				max = vect[i];
				position = i;
			}
		}
		System.out.println(" ");
		System.out.println("MAIOR VALOR = "+max);
		System.out.println("POSICAO DO MAIOR VALOR = "+position);									
		
		sc.close();
	}

}
