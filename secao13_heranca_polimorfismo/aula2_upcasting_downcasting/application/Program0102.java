package application;

import entities.Account2;
import entities.BusinessAccount2;
import entities.SavingAccount;

public class Program0102 {

	public static void main(String[] args) {
		// upcasting e downcasting
		
		Account2 acc = new Account2(1001, "Alex", 0.0);
		
		BusinessAccount2 bacc = new BusinessAccount2(1002, "Maria", 0.0, 500.0);
		
		//upcasting
		
		Account2 acc1 = bacc;
		Account2 acc2 = new BusinessAccount2(1003, "Bob", 0.0, 200.0);
		Account2 acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		//como a herança é uma relação de "é um" é normal atribuir um objeto que é
		//subclasse para a superclasse
		
		//downcasting
		
		BusinessAccount2 acc4 = (BusinessAccount2)acc2;
		acc4.loan(100.0);
		
		/*Para atribuir uma superclasse para uma subclasse é preciso
		 * forçar a conversão com um casting manual */
		
		//BusinessAccount2 acc5 = (BusinessAccount2)acc3;
		//essa conversão dará problema na hora de executar somente, porque 
		//o compulador não percebe que acc3 apesar de ser instaciada como account
		// é na verdade uma SavingAccount
		
		//validando o downcasting com o instanceof
		
		if(acc3 instanceof BusinessAccount2) {
			BusinessAccount2 acc5 = (BusinessAccount2)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
