package aula_1;

import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		// estrutura condicional encadeada
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas são?");
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}else if (hora < 18) {
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
																		
		sc.close();		

	}

}
