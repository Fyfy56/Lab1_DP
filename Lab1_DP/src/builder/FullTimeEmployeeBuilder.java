package builder;

import factory.FullTimeEmployee;
import singleton.Employee;

public class FullTimeEmployeeBuilder implements EmployeeBuilder {
	
	private Employee employee;
	
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

	@Override
	public Employee build() {
		return this.employee;
	}
	
	
}

