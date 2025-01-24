package aula_2_for;

import java.util.Iterator;
import java.util.Scanner;

public class ex1_for {

	public static void main(String[] args) {
		// para /for
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		for(int i=0; i<n; i++) {
			// i++ é igual a i = i+1
			int x = sc.nextInt();
			soma += +x;
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
