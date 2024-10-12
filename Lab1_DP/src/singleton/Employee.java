/* 
 *File name: Employee.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */


package singleton;
import builder.EmployeeBuilder;



/**
 * This abstract class defines the attributes of an employee
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */

public abstract class Employee{
	
	/**
	 * id of an Employee
	 */
	private int id;
	
	/**
	 * name of an Employee
	 */
    private String name;
    
    /**
	 * department of an Employee
	 */
    private String department;
    
    /**
	 * role of an Employee
	 */
    private String role;
    
    /**
	 * working hours per week of an Employee
	 */
    private String workingHoursPerWeek;
    
    /**
	 * salary of an Employee
	 */
    private double salary; 
    
    
    
    
    /**
     * Default constructor for the Employee class.
     */
    public Employee() {
    	
    }
    
    
    //getters and setters for the Employee class
    
    /**
     * Returns the id of an Employee
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id of an Employee
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the name of an Employee
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of an Employee
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the department of an Employee
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department of an Employee
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Returns the role of an Employee
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role of an Employee
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * Returns the working hours of an Employee
	 * @return the workingHoursPerWeek
	 */
	public String getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}

	/**
	 * Sets the working hours of an Employee
	 * @param workingHoursPerWeek the workingHoursPerWeek to set
	 */
	public void setWorkingHoursPerWeek(String workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}

	/**
	 * Returns the salary of an Employee
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary of an Employee
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	//Abstract Methods
	
	/**
     * Abstract method for clocking in
     */
	public abstract void clockIn();
	
	/**
     * Abstract method for clocking out
     */
    public abstract void clockOut();
    
    
    /**
     * Abstract method for tracking hours
     */
    public abstract void trackHours();
	
}