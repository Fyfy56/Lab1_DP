/* 
 *File name: EmployeeManagerTest.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */


package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Test class for the EmployeeManager singleton.
 * This class contains unit tests to verify the functionality of the EmployeeManager.
 */
class EmployeeManagerTest {

	/**
     * Verifies that multiple calls to getInstance() return the same instance
     * of EmployeeManager.
     */
	@Test
	void testGetInstance() {
		
		EmployeeManager employee1 = EmployeeManager.getInstance();
		EmployeeManager employee2 = EmployeeManager.getInstance();
		EmployeeManager employee3 = EmployeeManager.getInstance();
		
		//checks that the instances are the same
		assertTrue(employee1 == employee2 && employee2 == employee3);
		
	}

}
