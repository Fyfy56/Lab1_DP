/* 
 *File name: EmployeeFactory.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package factory;

import builder.EmployeeBuilder;
import builder.EmployeeDirector;
import builder.FullTimeEmployeeBuilder;
import builder.PartTimeEmployeeBuilder;
import singleton.Employee;

/**
 * This class generates instances of Employee using the appropriate builder
 * which are FullTimeEmployeeBuilder or PartTimeEmployeeBuilder 
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
public class EmployeeFactory {
	

	/**
	 * Creates an instance of an employee based on the type (full time or Part time)
	 * @param type
	 * @param id
	 * @param name
	 * @param department
	 * @param role
	 * @param workingHoursPerWeek
	 * @param salary
	 * @return the employee 
	 * @throws IllegalArgumentException if the employee type is invalid
	 */
	public static Employee employee  (String type, int id, String name, String department, String role, String workingHoursPerWeek, double salary) {
		
		//variable for the EmployeeBuilder
		EmployeeBuilder employeeBuilder;
		
		//Determines the type of employee
		switch (type) {
			case "Full Time":
				employeeBuilder = new FullTimeEmployeeBuilder();
				break;
			case "Part Time":
				employeeBuilder = new PartTimeEmployeeBuilder();
				break;
			default :
				throw new IllegalArgumentException("Invalid Employee Type");
		}
		
		// Creates an EmployeeDirector with the selected builder
		EmployeeDirector employeeDirector = new EmployeeDirector(employeeBuilder);
		
		//Uses EmployeeDirector to build and return an employee
		return employeeDirector.buildEmployee(id, name, department, role, workingHoursPerWeek, salary) ;
		
	}
	
}
