package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//composição de objetos:
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	//como cada trabalhador tem vários contratos, criamos um tipo lista
	
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		//não incluímos as listas no construtor e sim instanciamos por padrão na declaração do atributo na classe
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

		
	//incluir os métodos da classe
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//calculo do valor a ser recebido de trabalhos no ano
	//somente referente ao ano atual
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
			for (HourContract c : contracts) {
				cal.setTime(c.getDate());
				int c_year = cal.get(Calendar.YEAR);
				int c_month = 1 + cal.get(Calendar.MONTH);	
				if(year == c_year && month == c_month) {
					sum += c.totalValue();
				}
			}
		return sum;	
	}
	
}
