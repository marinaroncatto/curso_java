package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product2;
import util.ProductPredicate;

public class Program02 {

	public static void main(String[] args) {
		// TODO Implementando predicate

		List<Product2> list = new ArrayList<>();

		list.add(new Product2("Tv", 900.00));
		list.add(new Product2("Mouse", 50.00));
		list.add(new Product2("Tablet", 350.50));
		list.add(new Product2("HD Case", 80.90));

		list.removeIf(new ProductPredicate());
		//primeira forma de implementar

		for (Product2 p : list) {
			System.out.println(p);
		}

	}

}
