package entities;

public class BusinessAccount3 extends Account3{
private Double loanLimit;
	
	public BusinessAccount3() {
		super();
	}

	public BusinessAccount3(Integer number, String holder, Double balance, Double loanLimit) {
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
	
	//exemplo super
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
		//super server para chamar o metodo já implementado na superclasse
		//podemos adicionar regras após para fazer especializações
	}
}
