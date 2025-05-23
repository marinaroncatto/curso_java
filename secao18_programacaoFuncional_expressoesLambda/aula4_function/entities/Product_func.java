package entities;

public class Product_func {
	
	private String name;
	private Double price;
	
	public Product_func(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static String staticUpperCaseName(Product_func p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
