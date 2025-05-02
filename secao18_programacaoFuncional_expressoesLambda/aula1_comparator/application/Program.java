package application;

import java.util.ArrayList;
import java.util.List;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
		// Usando método comparator v.5 Lambda direto no argumento
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
			
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
