package aula_1;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		// estrutura condicional composta
		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas são?");
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}else {			
			System.out.println("Boa tarde!");
		}																
		sc.close();		
	}
}
	
	
