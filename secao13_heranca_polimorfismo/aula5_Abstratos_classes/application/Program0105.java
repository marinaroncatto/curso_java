package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account4;
import entities.BusinessAccount4;
import entities.SavingAccount3;

public class Program0105 {
	public static void main(String[] args) {
		//classes abstratas
		
		//Account4 acc1 = new Account4(1001, "Alex", 1000.);
		//acc1.withdraw(200.0);
		//System.out.println(acc1.getBalance());
		//A classe Account4 é abstrata, por isso não pode ser instanceada
		
		List<Account4> list = new ArrayList<>();
		
		Account4 acc1 = new SavingAccount3(1001, "Alex", 500., 0.01);		
		list.add(acc1);
		
		Account4 acc2 = new SavingAccount3(1002,"Maria", 1000.0, 0.01);		
		list.add(acc2);
		
		Account4 acc3 = new BusinessAccount4(1003, "Bob", 300.0, 500.0);		
		list.add(acc3);
		
		Account4 acc4 = new BusinessAccount4(1005, "Anna", 500.0, 500.0);		
		list.add(acc4);
		
		//somar total dos saldos
		double sum = 0.0;
		for(Account4 acc: list) {
			sum +=acc.getBalance();
		}
		
		System.out.printf("Total balance: $ %.2f",sum);
		
		//depositando 10 em cada conta
		for(Account4 acc: list) {
			acc.deposit(10.0);
		}
		System.out.println();
		for(Account4 acc: list) {
			System.out.printf("Updatated balance for account %d: $ %.2f%n",acc.getNumber(), acc.getBalance());
		}
	}
}
