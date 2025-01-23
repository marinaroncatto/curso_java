package aula_1;

import java.util.Scanner;

public class aula2_while {

	public static void main(String[] args) {
		// while
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			//soma = soma + x
			x=sc.nextInt();
			
		}
		
		System.out.println(soma);
		sc.close();

	}

}
