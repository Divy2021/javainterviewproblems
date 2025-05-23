package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(        new Employee("John", "HR", 50000),        new Employee("Jane", "IT", 60000),        new Employee("Doe", "Finance", 70000),    
				new Employee("Smith", "IT", 80000),        new Employee("Alice", "HR", 90000));
		
       //employeeList.stream().filter(x->x.department=="IT").max(Comparator.comparingDouble(Employee::salary));
		Map<String, Employee> topEmployees = 
				employeeList.stream()
			    .collect(Collectors.toMap(Employee::getDepartment,e -> e,BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary))
			    ));
		System.out.println(topEmployees);
		//for (Entry<String,Employee> topEmployes : topEmployees) {
			//System.out.println("employee "+topEmployes.getValue());
		//}
		
	}
	
	
}

 class Employee {
	public String name;
	public String department;
	public double salary;

	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

