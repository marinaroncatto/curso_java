package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportdProduct;
import entities.Product;
import entities.UsedProduct;

public class Exe {
	
		public static void main(String[] args) throws ParseException {
					
		//desafio herança e polimorfismo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
		System.out.println("Product #"+i+" data:");	
		
		System.out.print("Common, used or imported (c/u/i)? ");
		char op = sc.next().charAt(0);		
		sc.nextLine();
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
			if(op == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				
				Product p = new ImportdProduct(name, price, customFee);				
				list.add(p);
				
			}else if(op == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date =  LocalDate.parse(sc.next(), dtf);
				
				Product p = new UsedProduct(name, price, date);				
				list.add(p);
				
			}else {
				Product p = new Product(name, price);
				list.add(p);
			}				
		
				
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p: list) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();
	}
}
