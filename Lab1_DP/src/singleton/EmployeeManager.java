/* 
 *File name: EmployeeManager.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */


package singleton;
import java.util.ArrayList;
import java.util.List;

	/**
	 * This class is a singleton that manages a list of employees.
	 * It ensures that only one instance of the EmployeeManager exists throughout the system.
	 * @author Fiorela Flores
	 * @version 1.0
	 * @see java.lang.Object
	 * @since JDK 17.0.9
	 */
public class EmployeeManager {

		/**
		 * Single instance of EmployeeManager
		 */
	    private static EmployeeManager employeeManager;
	    
	    /**
	     * List for Employees
	     */
	    private List<Employee> employeeList;

	    
	    
	    /**
	     * This private Constructor prevents other classes to instantiatate  EmployeeManager. 
	     * Initializes the employee list.
	     */
	    private EmployeeManager() {
	        employeeList = new ArrayList<>();
	    }

	    
	    /**
	     * Gets the single instance of EmployeeManager, if there is no intance, it creates one.
	     * @return the single instance of EmployeeManager
	     */
	    public static EmployeeManager getInstance() {

	        if (employeeManager == null) {
	            employeeManager = new EmployeeManager();
	        }
	        return employeeManager;
	    }
	    
	    /**
	     * Adds an employee to the list
	     * @param employee The employee to be added
	     */
	    public void addEmployee(Employee employee){
	        employeeList.add(employee);
	    }
	    
	    /**
	     * Adds several employees to the list
	     * @param employees The array of employees to be added
	     */
	    public void addEmployees(Employee... employees){
	        for (Employee employee: employees) {
	        	this.addEmployee(employee);
	        }
	    }
	    
	    /**
	     * Removes an employee from the list
	     * @param employee The employee to be removed
	     */
	    public void removeEmployee(Employee employee){
	        employeeList.remove(employee);
	    }
	    
	    /**
	     * Retrieves and employee by their ID
	     * @param id The employee id
	     */
	    public Employee getEmployee(int id){
	        for(Employee employee : employeeList){
	            if (employee.getId() == id){
	                return employee;
	            }
	        }
			return null;
	    }
	    
	    /**
	     * Returns the list of employees
	     * @return a List of Employee objects
	     */
	    public List<Employee> employeesList(){
	    	return employeeList;
	    }
	    
}

