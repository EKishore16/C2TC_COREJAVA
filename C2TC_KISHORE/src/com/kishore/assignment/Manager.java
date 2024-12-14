package com.kishore.assignment;


/*
 * The Manager class represents an employee who holds a managerial position.
 * It extends the Employee class and includes an additional field for the department.
 */
public class Manager extends Employee {
	
	private String department;
	public Manager(String name, int employeeId, double salary, String department) {
		super(name, employeeId, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
}