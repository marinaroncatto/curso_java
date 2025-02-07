package entitie;

import java.util.Scanner;

public class Account {	
	private int aNumber;
	private String name;
	private double aValue;
			
	
	public Account(int aNumber, String name) {
		this.aNumber = aNumber;
		this.name = name;
	}
	
	public Account(int aNumber, String name, double initialDeposit) {
		this.aNumber = aNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getAnumber() {
		return aNumber;
	}
	
	public double getAvalue() {
		return aValue;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}		
	
	public void deposit(double deposit) {
		this.aValue += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.aValue += - withdraw - 5.00;
	}
	
	public String toString() {
		return "Account "+ getAnumber()+
				", Holder: "+ getName()+
				", Balance: $ "+ String.format("%.2f%n", getAvalue());
	}
}
