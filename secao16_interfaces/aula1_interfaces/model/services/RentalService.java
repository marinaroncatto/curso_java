package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService; //interface

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {		
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes(); //calcula o tempo entre duas horas
	double hours = minutes / 60.0;// 1h = 60 minutos
	
	double basicPayment;
	if(hours <= 12.0) {
		basicPayment = pricePerHour * Math.ceil(hours); //math.ceil arredonda pra cima		
	}
	else {
		basicPayment = pricePerDay * Math.ceil(hours /24); // 1 dia = 24h
	}
	
	double tax = taxService.tax(basicPayment);
	
	carRental.setInvoice(new Invoice(basicPayment, tax));
	
	}//fim função
	
	
}
