package util;

import java.util.function.Consumer;

import entities.Product3;

public class PriceUpdate implements Consumer<Product3>{

	@Override
	public void accept(Product3 p) {
		// TODO aumentar o preço dos produtos em 10%
		p.setPrice(p.getPrice() * 1.1);
		
	}
	
	
}
