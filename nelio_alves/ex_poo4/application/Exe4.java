package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exe4 {

	public static void main(String[] args) {
		// conversão de moeda
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How manu dollars will be bought? ");
		double quantitie = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n",CurrencyConverter.converter(dollarPrice,quantitie));
		
		
		sc.close();

	}

}
