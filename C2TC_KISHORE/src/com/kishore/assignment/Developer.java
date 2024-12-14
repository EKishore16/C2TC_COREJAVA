package com.kishore.assignment;

/*
 * The Developer class represents an employee specializing in software development.
 * It extends the Employee class and includes an additional field for the programming language.
*/

public class Developer extends Employee {
	private String programmingLanguage;
	public Developer(String name, int employeeId, double salary, String programmingLanguage) {
			super(name, employeeId, salary);
			this.programmingLanguage = programmingLanguage;
	}
	public String getProgrammingLanguage() {	
			return programmingLanguage;
	} 
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
}