package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Employee;

public class EmployeeService {

	public double filteredSum(List<Employee> list, Predicate<Employee> criteria) {
		double sum = 0.0;
		for (Employee emp : list) {
			if (criteria.test(emp)) {
				sum += emp.getSalary();
			}
		}
		return sum;
	}
}
