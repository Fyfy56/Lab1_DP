/* 
 *File name: EmployeeFactoryTest.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.Employee;


/**
 * This class contains unit tests to verify the functionality of the EmployeeFactory 
 * in creating different types of  Employee.
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
class EmployeeFactoryTest {

	/**
	 * Tests the creation of employee instances using EmployeeFactory.
	 */
	@Test
	void testEmployee() {
		
		//instnces for Full Time and Part Time employees
		Employee employee1 = EmployeeFactory.employee("Full Time", 6, "Oliver Davis", "Sales", "Sales Representative", "40", 50000.0);
		Employee employee2 = EmployeeFactory.employee("Part Time", 7, "Mia Robinson", "Research", "Research Engineer", "25", 85000.0);
		
		
		// Test for a Full Time employee type
		assertTrue(employee1 instanceof FullTimeEmployee);
		
		// Test for a Part Time employee type
		assertTrue(employee2 instanceof PartTimeEmployee);
		
		// Test for an invalid employee type
		assertThrowsExactly(
				IllegalArgumentException.class,
				() -> EmployeeFactory.employee("Voluntary", 6, "Lucas Wilson", "Sales", "Sales Associate", "30", 0)
		);
		
	}

}
