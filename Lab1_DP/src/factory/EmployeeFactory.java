package factory;

import builder.EmployeeBuilder;
import builder.EmployeeDirector;
import builder.FullTimeEmployeeBuilder;
import builder.PartTimeEmployeeBuilder;
import singleton.Employee;

public class EmployeeFactory {
	

	public static Employee employee  (String type, int id, String name, String department, String role, String workingHoursPerWeek, double salary) {
		
		EmployeeBuilder employeeBuilder;
		
		switch (type) {
			case "Full Time":
				employeeBuilder = new FullTimeEmployeeBuilder();
				break;
			case "Part Time":
				employeeBuilder = new PartTimeEmployeeBuilder();
				break;
			default :
				throw new IllegalArgumentException("Invalid Employee Type");
		}
		
		EmployeeDirector employeeDirector = new EmployeeDirector(employeeBuilder);
		return employeeDirector.buildEmployee(id, name, department, role, workingHoursPerWeek, salary) ;
		
	}
	
}
