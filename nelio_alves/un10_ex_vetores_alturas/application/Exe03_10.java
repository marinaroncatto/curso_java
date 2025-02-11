package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exe03_10 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dado da "+(i+1)+"a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Person(nome, idade, altura);
		}
		
		double soma = 0.0;
		int contagemIdade = 0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				contagemIdade += +1;
			}
		}
		
		double porcent =  contagemIdade * 100.0 / n;
		double media = soma / vect.length;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n",media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcent);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		sc.close();
		
		
	}

}
