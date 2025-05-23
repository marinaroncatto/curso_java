package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exceptions.AccountException;

public class Exe {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
		 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
		 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
		 * ao limite de saque da conta.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Widhdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amountWithdraw = sc.nextDouble();

			acc.withdraw(amountWithdraw);

			System.out.printf("New balance: %.2f%n", acc.getBalance());
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Unespected error: ");
			 e.printStackTrace();
		}

		sc.close();
	}// fim main

}
