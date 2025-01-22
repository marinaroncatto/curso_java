package aula_2;

import java.util.Locale;
import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		// operadores de atribuição cumulativa
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100)*2.0;
			// abrevia "conta = conta +"
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n",conta);
		
		sc.close();

	}

}
