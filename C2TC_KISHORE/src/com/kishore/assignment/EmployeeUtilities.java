package com.kishore.assignment;

/*
 * The EmployeeUtilities class provides utility methods for handling Employee objects.
 * It includes functionality to print details of employees, supporting both general and specialized types.
*/

public class EmployeeUtilities {
	
	public static void printEmployeeDetails(Employee employee) {	
		System.out.println("--------------------------------------------");
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee ID: " + employee.getEmployeeId());
		System.out.println("Salary: " + employee.getSalary());
		if (employee instanceof Manager) {
			Manager manager = (Manager) employee;
			System.out.println("Department: " + manager.getDepartment());
		} else if (employee instanceof Developer) {
			Developer developer = (Developer) employee;
			System.out.println("Programming Language: " + developer.getProgrammingLanguage());
		}
		System.out.println("--------------------------------------------");
	}
}