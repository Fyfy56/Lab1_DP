/* 
 *File name: EmployeeBuilder.java
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
 * This interface defines the methods required to build an Employee object
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
public interface EmployeeBuilder {
	/**
	 * Sets the ID of the employee.
	 * @param id
	 * @return id of an employee
	 */
	EmployeeBuilder setId(int id);
	
	/**
	 * Sets the name of the employee.
	 * @param name
	 * @return name of an employee
	 */
    EmployeeBuilder setName(String name);
    
    
    /**
	 * Sets the department of the employee.
	 * @param department
	 * @return department of an employee
	 */
    EmployeeBuilder setDepartment(String department);
    
    
    /**
	 * Sets the role of the employee.
	 * @param role
	 * @return role of an employee
	 */
    EmployeeBuilder setRole(String role);
    
    /**
	 * Sets the working hours of the employee.
	 * @param workingHoursPerWeek
	 * @return working hours of an employee
	 */
    EmployeeBuilder setWorkingHoursPerWeek(String workingHoursPerWeek);
    
    /**
	 * Sets the salary of the employee.
	 * @param salary
	 * @return salary of an employee
	 */
    EmployeeBuilder setSalary(double salary);
    
    /**
     * Builds and returns the constructed employee
     * @return an employee object
     */
    Employee build();
}