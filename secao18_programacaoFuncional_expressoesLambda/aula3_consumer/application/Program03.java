package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product3;

public class Program03 {

	public static void main(String[] args) {
		// TODO v4 consumer com expressão lambda declarada
		
		List<Product3> list = new ArrayList<>();
		 
 		list.add(new Product3("Tv", 900.00));
 		list.add(new Product3("Mouse", 50.00));
 		list.add(new Product3("Tablet", 350.50));
 		list.add(new Product3("HD Case", 80.90));
 
 		double factor = 1.1;
 		
 		Consumer<Product3> cons = p -> p.setPrice(p.getPrice() * factor);
 		
 		list.forEach(cons);
 
 		list.forEach(System.out::println);

	}

}
