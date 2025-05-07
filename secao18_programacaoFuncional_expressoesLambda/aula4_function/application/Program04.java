package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product_func;

public class Program04 {

	public static void main(String[] args) {
		// TODO v4. function empressão lambda declarada
		
		List<Product_func> list = new ArrayList<>();

		list.add(new Product_func("Tv", 900.00));
		list.add(new Product_func("Mouse", 50.00));
		list.add(new Product_func("Tablet", 350.50));
		list.add(new Product_func("HD Case", 80.90));

		Function<Product_func, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(func).collect(Collectors.toList());
				
		names.forEach(System.out::println);

	}

}
