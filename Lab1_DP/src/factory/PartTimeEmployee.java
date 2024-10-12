/* 
 *File name: PartTimeEmployee.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package factory;

import singleton.Employee;

/**
 * This class overrides the methods from the Employee class for some functionality related to Part Time employees
 */
public class PartTimeEmployee extends Employee {

	/**
	 * Default Constructor. 
	 * Initializes a new instance of PartTimeEmployee
	 * @author Fiorela Flores
	 * @version 1.0
	 * @see java.lang.Object
	 * @since JDK 17.0.9
	 */
	public PartTimeEmployee() {
		super();
	}

	/**
	 * Prints a message alerting that the employee has clocked in.
	 */
	@Override
	public void clockIn() {
		System.out.println(this.getName() + " has clocked in");
		
	}
	
	/**
	 * Prints a message alerting that the employee has clocked out.
	 */
	@Override
	public void clockOut() {
		System.out.println(this.getName() + " has clocked out");
		
	}

	/**
	 * Tracks the working hours for the employee
	 */
	@Override
	public void trackHours() {
		System.out.println("Tracking hours for " + this.getName() + " from " + this.getDepartment()
								+ " with the role of " + this.getRole() + "..." 
										+ "\n-->Hours per Week: " + this.getWorkingHoursPerWeek()
												+ "\n-->Salary:  " + this.getSalary());
		
	}

}
