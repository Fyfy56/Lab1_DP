/* 
 *File name: PartTimeEmployeeBuilder.java
 *Author: Fiorela Flores, ID# 041130667
 *Course: CST8288
 *Term: Fall 2024
 *Assignment: lab 1
 *Date: October 11, 2024
 *Professor: Reginald Dyer
 *Purpose: This program manages the characteristics of an employee.
 */

package builder;

import factory.PartTimeEmployee;
import singleton.Employee;


/**
 * This class implements EmployeeBuilder for constructing PartTimeEmployee instances. 
 * It provides methods to set the various attributes of a part time employee.
 * @author Fiorela Flores
 * @version 1.0
 * @see java.lang.Object
 * @since JDK 17.0.9
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
		
		// The PartTimeEmployee instance being built
		private Employee employee;
		
		
		/**
	     * Constructs a new PartTimeEmployeeBuilder and initializes a new PartTimeEmployee.
	     */
		public PartTimeEmployeeBuilder() {
			this.employee = new PartTimeEmployee();
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
	     * Builds and returns the PartTimeEmployee instance.
	     */
		@Override
		public Employee build() {
			return this.employee;
		}
		
		
	}



