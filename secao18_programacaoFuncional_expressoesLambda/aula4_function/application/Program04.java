package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import entities.Product_func;
import util.UpperCaseName;

public class Program04 {

	public static void main(String[] args) {
		// TODO v1. function a partir da interface
		
		List<Product_func> list = new ArrayList<>();

		list.add(new Product_func("Tv", 900.00));
		list.add(new Product_func("Mouse", 50.00));
		list.add(new Product_func("Tablet", 350.50));
		list.add(new Product_func("HD Case", 80.90));

		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
				
		names.forEach(System.out::println);

	}

}
