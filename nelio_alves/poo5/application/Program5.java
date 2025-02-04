package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator2;

public class Program5 {

	public static void main(String[] args) {
		// método estático 3
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator2.circumference(radius);
		
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circunference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n",Calculator2.PI);
		
		sc.close();
	}

}
