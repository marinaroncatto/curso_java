package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

	//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufectureDate;
	
	public UsedProduct() {
		super();
	}
		

	public UsedProduct(String name, Double price, LocalDate manufectureDate) {
		super(name, price);
		this.manufectureDate = manufectureDate;
	}



	public LocalDate getManufectureDate() {
		return manufectureDate;
	}

	public void setManufectureDate(LocalDate manufectureDate) {
		this.manufectureDate = manufectureDate;
	}
	
	@Override
	public final String priceTag() {
		return name + " (used) $ "+String.format("%.2f", price)+" (Manufacture date: "+dtf.format(manufectureDate)+")";
	}
	
}
