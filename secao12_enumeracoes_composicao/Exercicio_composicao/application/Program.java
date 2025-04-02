package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Order_;
import entities.Product;
import entities.enums.OrderStat;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Exercício fixação
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client c1 = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStat status = OrderStat.valueOf(sc.next());  
		
		Order_ order = new Order_(new Date(), status, c1);
		
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #"+i+" item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			Product p = new Product(nome, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			
			OrderItem item = new OrderItem(quantity, price, p);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
				
		sc.close();

	}

}
