package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exe {

	public static void main(String[] args) {
		// Programa para calcular area, perimetro e altura 
		// de um triangulo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println(r.toString());
		
		sc.close();

	}

}
