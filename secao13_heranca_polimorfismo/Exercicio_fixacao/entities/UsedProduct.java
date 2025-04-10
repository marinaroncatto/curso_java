package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufectureDate;
	
	public UsedProduct() {
		super();
	}
		

	public UsedProduct(String name, Double price, Date manufectureDate) {
		super(name, price);
		this.manufectureDate = manufectureDate;
	}



	public Date getManufectureDate() {
		return manufectureDate;
	}

	public void setManufectureDate(Date manufectureDate) {
		this.manufectureDate = manufectureDate;
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ "+price+" (Manufacture date: "+sdf.format(manufectureDate)+")";
	}
	
}
