package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;



public class Exe_ex_listas {

	public static void main(String[] args) {
		// cadastro e aumento de funcionário com listas
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list= new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n= sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Funcionario fun = new Funcionario(id, name, salary);
			list.add(fun);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase:  ");
		int idsalary = sc.nextInt();
		
		Integer pos = hasId(list, idsalary);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).aumentoSalario(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Funcionario fun: list) {
			System.out.println(fun);
		}
		
		
		sc.close();

	}

	//função para verificar se o id já foi utilizado
	public static Integer hasId(List<Funcionario> list, int id) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
				
		return null;
	}
	
	
}
