package util;

import java.util.function.Predicate;

import entities.Product2;

public class ProductPredicate implements Predicate<Product2>{
	//predicate é uma interface funcional
	
	@Override
	public boolean test(Product2 p) {
		//TODO: testar se é maior ou igual a 100.0
		return p.getPrice() >= 100.0;
	}

}
