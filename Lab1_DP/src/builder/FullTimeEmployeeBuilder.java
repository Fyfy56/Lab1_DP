/* 
 *File name: FullTimeEmployeeBuilder.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package builder;

import factory.FullTimeEmployee;
import singleton.Employee;

/**
 * This class implements EmployeeBuilder for constructing FullTimeEmployee instances. 
 * It provides methods to set the various attributes of a full-time employee.
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {
	
	// The FullTimeEmployee instance being built
	private Employee employee;
	
	/**
     * Constructs a new FullTimeEmployeeBuilder and initializes a new FullTimeEmployee.
     */
	public FullTimeEmployeeBuilder() {
		this.employee = new FullTimeEmployee();
	}
	
	
	@Override
	public EmployeeBuilder setId(int id) {
		this.employee.setId(id);
		return this;
	}
	
	@Override
	public EmployeeBuilder setName(String name) {
		this.employee.setName(name);
		return this;
	}

	@Override
	public EmployeeBuilder setDepartment(String department) {
		this.employee.setDepartment(department);
		return this;
	}

	@Override
	public EmployeeBuilder setRole(String role) {
		this.employee.setRole(role);
		return this;
	}

	@Override
	public EmployeeBuilder setWorkingHoursPerWeek(String workingHoursPerWeek) {
		this.employee.setWorkingHoursPerWeek(workingHoursPerWeek);
		return this;
	}

	@Override
	public EmployeeBuilder setSalary(double salary) {
		this.employee.setSalary(salary);
		return this;
	}

	/**
     * Builds and returns the FullTimeEmployee instance.
     */
	@Override
	public Employee build() {
		return this.employee;
	}
	
	
}

