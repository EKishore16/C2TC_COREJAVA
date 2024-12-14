package com.kishore.assignment;
/*
* The AssignmentMain class serves as the entry point for the application.
* It demonstrates the use of inheritance and utility methods to handle employee details.
*/

public class AssignmentMain {
	 /* 
     * The main method is the entry point for the Java application.
     * It creates instances of Manager and Developer classes. 
     * Usage of EmployeeUtilities class to print their details.
     * parameter arguments Command-line arguments (not used in this application).
     */
	public static void main(String[] args) {
		Manager manager = new Manager("Kishore", 101, 9000000, "Project Management");
		Developer developer = new Developer("Alice", 102, 600000, "Python");
		EmployeeUtilities.printEmployeeDetails(manager);
		EmployeeUtilities.printEmployeeDetails(developer);
	}
}