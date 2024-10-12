/* 
 *File name: EmployeeDirector.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package builder;
import singleton.Employee;

/**
 * This class takes an instance of an EmployeeBuilder and uses it to set the employee's attributes.
 * Builds and returns an Employee.
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
public class EmployeeDirector {
	
	 // The builder used to construct an employee
	private EmployeeBuilder builder;
	
	/**
     * Constructs an EmployeeDirector with the EmployeeBuilder interface.
     * @param builder The builder used for constructing an employee
     */
	public EmployeeDirector(EmployeeBuilder builder) {
		this.builder = builder;
	}
	
	/**
	 * Builds an Employee instance with the specified attributes.
	 * @param id
	 * @param name
	 * @param department
	 * @param role
	 * @param workingHoursPerWeek
	 * @param salary
	 * @return the constructed employee
	 */
	public Employee buildEmployee(int id, String name, String department, String role, String workingHoursPerWeek, double salary) {
		
		// Use the builder to set the attributes
		this.builder.setId(id).setName(name).setDepartment(department).setRole(role).setWorkingHoursPerWeek(workingHoursPerWeek).setSalary(salary);
		return this.builder.build();
		
	}
	
}
