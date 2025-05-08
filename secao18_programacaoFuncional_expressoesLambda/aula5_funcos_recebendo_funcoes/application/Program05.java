package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product05;
import model.services.ProductService;

public class Program05 {

	public static void main(String[] args) {
		// TODO Função recebendo outra função como argumento
		
		Locale.setDefault(Locale.US);
		List<Product05> list = new ArrayList<>();
		
		list.add(new Product05("Tv", 900.00));
		list.add(new Product05("Mouse", 50.00));
		list.add(new Product05("Tablet", 350.50));
		list.add(new Product05("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
