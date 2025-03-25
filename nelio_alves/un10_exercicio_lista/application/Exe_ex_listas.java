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
			
			while(hasId(list, id)) {
				System.out.println("Id already taken!! Try again!");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
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
		
		Funcionario fun = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idsalary);
		
		if(fun == null) { //ou pos
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			fun.aumentoSalario(percent);
			//list.get(pos).aumentoSalario(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Funcionario f: list) {
			System.out.println(f);
		}
		
		
		sc.close();

	}

	//função para veirificar se id existe
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}
	
	
	
	//função para verificar se o id já foi utilizado
	public static Integer position(List<Funcionario> list, int id) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
				
		return null;
	}
	
	
}
