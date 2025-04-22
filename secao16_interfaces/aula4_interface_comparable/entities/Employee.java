package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {	
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		// método para comparar algo, precisa ser
		//definido o que deve ser comparado
		return name.compareTo(other.getName());//compara nomes para ordenar
		//return salary.compareTo(other.getSalary()); //compara salarios em ordem crescente
		//return -salary.compareTo(other.getSalary()); //compara salarios em ordem decrescente
	}
	
	
	
	
}
