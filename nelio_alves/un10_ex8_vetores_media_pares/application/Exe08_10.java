package application;

import java.util.Locale;
import java.util.Scanner;

public class Exe08_10 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int soma = 0;
		int cont = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				cont ++;
			}
		}
		
		double media = (double) soma / cont;
		
		if (cont > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n",media);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		
		sc.close();
	}

}
