package com.kishore.assignment;

public class Employee {
	
/*
 * The Employee class represents a generic employee in the organization.
 * It serves as a base class for specialized employee types like Manager and Developer.
 * This class contains fields for common attributes such as name, employee ID, and salary.
*/
	
	private String name;
	private int employeeId;
	private double salary;
	
	public Employee(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	} 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}