package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Account;

public class Exe5 {

	public static void main(String[] args) {
		// sistema bancário

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;

		System.out.print("Enter account number: ");
		int aNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
	
		System.out.println("Is there an initial deposit (y/n)?");
		char opt = sc.next().charAt(0);		

		if (opt == 'y') {
			System.out.println("Enter inicial deposit value: ");
			double initialDeposit = sc.nextDouble();
			ac = new Account(aNumber, name, initialDeposit);
		}else {
			ac = new Account(aNumber, name);
		}

		System.out.println("Accout data: \n" + ac);

		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		ac.deposit(deposit);

		System.out.println("Updated account data: \n" + ac);

		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);

		System.out.println("Updated account data:  \n" + ac);

		sc.close();

	}

}
