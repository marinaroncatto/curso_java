package entitie;

import java.util.Scanner;

public class Account {	
	private int aNumber;
	private String name;
	private double aValue;
	
	
	public Account() {
		
	}
	
	public Account(int aNumber, String name) {
		this.aNumber = aNumber;
		this.name = name;
	}
	
	public Account(int aNumber, String name, double aValue) {
		this.aNumber = aNumber;
		this.name = name;
		this.aValue = aValue;
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
	
	/* public void create(char opt) {
		
		if (opt == 'y') {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter inicial deposit value: ");
			double deposit = sc.nextDouble();
			Account ac = new Account(aNumber,name, deposit);
			sc.close();
		}else {
			Account ac = new Account(aNumber,name);
		}
		
	}*/
	
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
