package entities;

public class BusinessAccount2 extends Account2{
private Double loanLimit;
	
	public BusinessAccount2() {
		super();
	}

	public BusinessAccount2(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //inclui construtor da superclasse
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount- 10.0;
		}		
	}
}
