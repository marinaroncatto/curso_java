package entities;

public class Account3 {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account3() {
		
	}

	public Account3(Integer number, String holder, Double balance) {		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	//saque
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
