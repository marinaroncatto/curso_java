package util;

import java.util.function.Predicate;

import entities.Product2;

public class ProductPredicate implements Predicate<Product2>{
	
	@Override
	public boolean test(Product2 p) {
		return p.getPrice() >= 100.0;
	}
}
