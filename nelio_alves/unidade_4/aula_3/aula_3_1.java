package aula_3;

import java.util.Locale;
import java.util.Scanner;

public class aula_3_1 {

	public static void main(String[] args) {
		// Entrada de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;

		x = sc.next();
		System.out.println("Você digitou: " + x);
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		z = sc.nextDouble();
		// esse comando usará a localidade do sistema
		// para a formatação, (portanto "," br)
		// se precisar aceitar o import com "."
		// precisará do Locale.US
		System.out.printf("Você digitou: %.2f%n", z);
		/*
		 * Já o print sempre irá imprimir no modo americado com ".", para mudar isso
		 * basta usar o printf
		 */
		a = sc.next().charAt(0);
		// armazena só o primeiro caracter da palavra
		System.out.println("Você digitou: " + a);
		sc.close();
		
	 /*atalhos
	  * Sysout + ctrl barra -> println
	  * ctral shift f -> auto endentação*/
	}

}
