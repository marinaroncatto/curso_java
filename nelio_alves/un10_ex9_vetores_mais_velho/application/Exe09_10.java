package application;

import java.util.Scanner;

import entities.Pessoa;

public class Exe09_10 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
		 */
		
		//farei usando vetor com classe para praticar
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		int cont = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			vect[i] = new Pessoa(nome, idade);
			
			if (vect[i].getIdade() > cont) {
				cont = vect[i].getIdade();
			}
		}
		
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i].getIdade() == cont) {
				System.out.print("PESSOA MAIS VELHA: "+vect[i].getNome());
			}
		}
		
		sc.close();

	}

}
