package util;

import java.util.function.Function;

import entities.Product_func;

public class UpperCaseName implements Function<Product_func, String>{

	@Override
	public String apply(Product_func p) {
		return p.getName().toUpperCase();
	}

}
