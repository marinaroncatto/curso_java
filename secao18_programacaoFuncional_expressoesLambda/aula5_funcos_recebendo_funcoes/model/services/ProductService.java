package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product05;

public class ProductService {
	
	public double filteredSum(List<Product05> list, Predicate<Product05> criteria) {
		double sum = 0.0;
		for(Product05 p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
