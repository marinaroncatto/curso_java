package entities;

public class ImportdProduct extends Product{
	
	private Double customFee;
	
	public ImportdProduct() {
		super();
	}

	public ImportdProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public double totalPrice() {
		return price + customFee;
	}
	
	@Override
	public final String priceTag() {
		return super.priceTag() + " (Customs fee: $ "+customFee+")";
	}
	
}
