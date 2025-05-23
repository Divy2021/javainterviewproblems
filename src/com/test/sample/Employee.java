package com.test.sample;

public class Employee {
	
	private String name;
	private long salary;
	private int age;
	private Department dept;
	
	public Employee(String n, long salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Department getDept() {
		
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
}
