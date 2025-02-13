package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa_;

public class Exe11_10 {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa_[] v = new Pessoa_[n];
		
		double menor = 3.0, maior = 0.0, soma = 0.0;
		int contM = 0, contF = 0; 
		
		
		for(int i = 0; i < v.length; i++) {
			
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			char genero = sc.next().toUpperCase().charAt(0);
			
			v[i] = new Pessoa_(altura, genero);						
		
			if (menor > v[i].getAltura()) {
				menor = v[i].getAltura();
			}
			
			if (maior < v[i].getAltura()) {
				maior = v[i].getAltura();
			}
			
			if (v[i].getGenero() == 'M') {
				contM ++;
			}else {
				contF++;
			}
			
			if (v[i].getGenero() == 'F') {
				soma += v[i].getAltura();
			}
		}
		
		double media = (double) soma / contF;
		
		System.out.println("Menor altura = "+menor);
		System.out.println("Maior altura = "+maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n",media);
		System.out.println("Numero de homens = "+contM);
		
		sc.close();
	}

}
