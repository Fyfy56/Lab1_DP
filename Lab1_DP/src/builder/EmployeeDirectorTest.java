/* 
 *File name: EmployeeDirectorTest.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.Employee;

/**
 * This class ensures that the EmployeeDirector correctly builds full-time and part-time employees
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
class EmployeeDirectorTest {

	/**
     * Tests the buildEmployee method of the EmployeeDirector class
     */
	@Test
	void testBuildEmployee() {
		// Create an instance of EmployeeDirector
		EmployeeDirector one = new EmployeeDirector(new FullTimeEmployeeBuilder());
		EmployeeDirector two = new EmployeeDirector(new PartTimeEmployeeBuilder());
		
		// Build a new Employee instance using buildEmployee() method
		Employee employee1 = one.buildEmployee(1, "Ava Martinez", "Sales", "Account Executive", "40", 65000.0);
		Employee employee2 = two.buildEmployee(2, "Grace Hall", "Marketing", "Content Strategist", "25", 40000.0);
		
		//Full-time employee
		assertEquals(employee1.getId(), 1);
		assertEquals(employee1.getName(), "Ava Martinez");
		assertEquals(employee1.getDepartment(), "Sales");
		assertEquals(employee1.getRole(), "Account Executive");
		assertEquals(employee1.getWorkingHoursPerWeek(), "40");
		assertEquals(employee1.getSalary(), 65000.0);
		
		//Part-time employee
		assertEquals(employee2.getId(), 2);
		assertEquals(employee2.getName(), "Grace Hall");
		assertEquals(employee2.getDepartment(), "Marketing");
		assertEquals(employee2.getRole(), "Content Strategist");
		assertEquals(employee2.getWorkingHoursPerWeek(), "25");
		assertEquals(employee2.getSalary(), 40000.0);

		
		
	}

}
