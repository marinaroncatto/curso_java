package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {
		// POO 2
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product2 product = new Product2();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: "+product);				
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+product);
		
		sc.close();		
	}

}
