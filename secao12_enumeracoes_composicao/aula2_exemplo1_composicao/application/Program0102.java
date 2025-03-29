package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program0102 {

	public static void main(String[] args) throws ParseException {
		// exemplo de composição
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String deparmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double workerBaseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(deparmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #"+ i +" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			System.out.println();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Entermonth and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); //recorta a posição um e dois e transforma em int
		int year = Integer.parseInt(monthAndYear.substring(3));// recorta da posição tres em diante e tranforma em int
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for "+monthAndYear +": "+ String.format("%.2f",worker.income(year, month)));
		sc.close();

	}

}
