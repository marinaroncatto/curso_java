package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product02_10;

public class Program02_10 {

	public static void main(String[] args) {
		// vetor com classes
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		Product02_10[] vect = new Product02_10[n];
		//n pode ser substituído por vect.lenght;
		//pois corresponde ao tamanho do vetor
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product02_10(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i <  vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVARAGE HEIGHT: %.2f%n",avg);
		
		
		
		sc.close();
	}

}
