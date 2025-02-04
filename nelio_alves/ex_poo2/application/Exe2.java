package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exe2 {

	public static void main(String[] args) {
		// calculo de salário bruto
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: "+emp.toString());
		System.out.print("Which percentage to increase salary? ");
		double perc = sc.nextDouble();
		
		emp.increaseSalary(perc);
		
		System.out.println("Updated data: "+emp.toString());
		sc.close();

	}

}
