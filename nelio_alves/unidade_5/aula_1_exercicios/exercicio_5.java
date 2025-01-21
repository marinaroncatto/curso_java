package aula_1_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, 
		 * escreva um programa que leia o código de
		 *  um item e a quantidade deste item. A
			seguir, calcule e mostre o valor da
			 conta a pagar.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double preco = 0;
		
		System.out.println	("CODIGO *** ESPECIFICAÇÃO *** PREÇO");
		System.out.println	("  1		Cachorro Quente   R$ 4.00");
		System.out.println	("  2		X-Salada   		  R$ 4.50");
		System.out.println	("  3		X-Bacon   		  R$ 5.00");
		System.out.println	("  4		Torrada simples	  R$ 2.00");
		System.out.println	("  5		Refrigerante	  R$ 1.50");
		System.out.println("Escolha o código do produto:");
		codigo = sc.nextInt();
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = quantidade * 4;
		}else if (codigo == 2) {
			preco = quantidade * 4.50;
		}else if (codigo == 3) {
			preco = quantidade * 5;
		}else if (codigo == 4) {
			preco = quantidade * 2;
		}else if (codigo == 5) {
			preco = quantidade * 1.50;
		}else {
			System.out.println("CODIGO INVALIDO");
		}
		
		System.out.printf("TOTAL: R$ %.2f%n",preco);
		sc.close();
	}

}
