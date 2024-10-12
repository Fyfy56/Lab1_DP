/* 
 *File name: EMS.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package EMS;

import builder.EmployeeDirector;
import factory.EmployeeFactory;
import singleton.Employee;
import singleton.EmployeeManager;


/**
 * This class outputs the list of employees on the system. 
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */

public class EMS {
	
	/**
	 * This method is the entry point of the program
	 * @param args 
	 */
	public static void main(String[] args) {
		 
		// Initialization for instances of employees
		Employee employee1 = EmployeeFactory.employee("Full Time", 1, "Ava Thompson", "Human Resources", "Recruiter", "40", 60000);
		Employee employee2 = EmployeeFactory.employee("Part Time", 2, "Liam Carter", "Marketing", "Project Manager", "30", 45000);
		Employee employee3 = EmployeeFactory.employee("Full Time", 3, "Sophia Lee", "Finance", "Accountant", "45", 70000);
		Employee employee4 = EmployeeFactory.employee("Part Time", 4, "Noah Smith", "Operations", "Facilities Manager", "25", 45000);
		Employee employee5 = EmployeeFactory.employee("Full Time", 5, "Ethan Williams", "IT", "Network Engineer", "42", 80000);

		//adds the employees to the list
		EmployeeManager.getInstance().addEmployees(employee1,employee2, employee3, employee4, employee5 );
		
		
		//Iterates trhough the list of employees to output the status of a employee 
		for(Employee employee : EmployeeManager.getInstance().employeesList()) {
			employee.clockIn();
			employee.clockOut();
			employee.trackHours();
			System.out.println();
		}
	}

}
