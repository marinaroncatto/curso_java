package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de 
		 * um funcionário, seu número de horas 
		 * trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário.
	 A seguir, mostre o número e o salário do 
	 funcionário, com duas casas
	decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id =sc.nextInt();
		double horas = sc.nextDouble();
		double valorhora = sc.nextDouble();
		
		double salario = horas * valorhora;
		
		System.out.println("NUMBER = "+id);
		System.out.printf("SALARY = U$ %.2f%n",salario);
		sc.close();
	}

}
