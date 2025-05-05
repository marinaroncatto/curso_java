package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product3;
import util.PriceUpdate;

public class Program03 {

	public static void main(String[] args) {
		// TODO v1 implementando interface Consumer
		
		List<Product3> list = new ArrayList<>();
		 
 		list.add(new Product3("Tv", 900.00));
 		list.add(new Product3("Mouse", 50.00));
 		list.add(new Product3("Tablet", 350.50));
 		list.add(new Product3("HD Case", 80.90));
 
 		list.forEach(new PriceUpdate());
 
 		list.forEach(System.out::println);

	}

}
