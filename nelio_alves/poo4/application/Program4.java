package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator2;

public class Program4 {	
	
	public static void main(String[] args) {
		// Métodos estáticos versão 2
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator2 calc = new Calculator2();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n",calc.PI);
		
		sc.close();

	}
		

}
