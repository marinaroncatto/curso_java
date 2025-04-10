package entitie;

public class Product3 {

	private String name;
	private double price;
	private int quantity;

	
	/*Para gerar automaticamente:
	 * botão direito > source > generate */
	
	//construtor padrão
	
	public Product3() {
		
	}
	
	public Product3(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga
	
	public Product3(String name, double price) {
		this.name = name;
		this.price = price;		
	}
	
	// gets e sets
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//para proteger o produto, não faremos um
	// set quantity, pois esse só será alterado
	//via métodos e não diretamente atributo
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
