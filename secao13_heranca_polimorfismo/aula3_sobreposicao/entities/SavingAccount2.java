package entities;

public class SavingAccount2 extends Account3{
	//usamos a palavra final quando queremos impedir que uma
	//classe ou método seja herdado
	
	private Double interestRate;
	
	public SavingAccount2() {
		super();
	}

	public SavingAccount2(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//é uma boa prática adicionar final em métodos sobrepostos
	//para evitar uma nova sobreposição e deixar o código confuso
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
