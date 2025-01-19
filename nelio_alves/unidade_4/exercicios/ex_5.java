package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma 
		 * peça 1, o número de peças 1, o valor unitário 
		 * de cada peça 1, o código de uma peça 2, 
		 * o número de peças 2 e o valor unitário de cada 
		 * peça 2. Calcule e mostre o valor a ser pago.
		 */
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	int c1 = sc.nextInt();
	int n1 = sc.nextInt();
	double v1 = sc.nextDouble();
	int c2 = sc.nextInt();
	int n2 = sc.nextInt();
	double v2 = sc.nextDouble();
	
	double total = (n1*v1)+(n2*v2);
	
	System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
	
	
	
	sc.close();

	}

}
