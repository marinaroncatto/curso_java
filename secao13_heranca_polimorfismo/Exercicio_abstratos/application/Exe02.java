package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Exe02 {

	public static void main(String[] args) {
		// Desafio com classes abstratas
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new PessoaFisica(name, income, health));
			}else {
				System.out.print("Number of employees: ");
				int employee = sc.nextInt();
				list.add(new PessoaJuridica(name, income, employee));
			}						
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Pessoa p: list) {
			System.out.println(p.getNome()+" $ "+String.format("%.2f", p.imposto()));		
		}
		
		double sum = 0.0;
		
		for(Pessoa p: list) {
			sum += p.imposto();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n",sum);
		
		
		sc.close();
		

	}

}
